DESCRIPTION = "High-performance AMQP-compliant message broker written in Erlang."
HOMEPAGE = "http://www.rabbitmq.com/"
LICENSE = "MPL-1.1"
LIC_FILES_CHKSUM = "file://LICENSE-MPL-RabbitMQ;md5=b651d0a6feaaf2bf5eb9d36b2495c510"
SECTION = "network"
DEPENDS = "erlang-native libxslt python-simplejson zip-native unzip-native libxslt-native"
PR = "r0"

SRC_URI = "http://www.rabbitmq.com/releases/rabbitmq-server/v${PV}/${PN}-${PV}.tar.gz \
           file://remove-docs.patch \
           file://rabbitmq.service \
           file://rabbitmq-env.conf \
           file://rabbitmq.config \
           file://enabled_plugins \
           "

SRC_URI[md5sum] = "09d1af64c005bc680d6790b90655d021"
SRC_URI[sha256sum] = "a930f92b362df2f292ec5f0281aa2011eb0c668faf6e24c4653a9fc53ec43b9f"

RDEPENDS_${PN} = "erlang erlang-modules"

RABBITMQ_DIRECTORY_NAME = "rabbitmq"

do_compile() {
    oe_runmake
}

do_install() {
    RABBIT_LIB_DIR=${D}${libdir}/rabbitmq/lib/${PN}-${PV}

    sed -e "s:^RABBITMQ_HOME=.*:RABBITMQ_HOME=\"${libdir}/rabbitmq/lib/${PN}-${PV}\":g" \
               -i ${S}/scripts/rabbitmq-env
    oe_runmake TARGET_DIR=${D} \
               SBIN_DIR=${D}/${bindir} \
               MAN_DIR=${D}/${mandir} install \

    install -d ${D}${libdir}/rabbitmq/lib/${PN}-${PV}

    install -d ${D}${localstatedir}/log/${RABBITMQ_DIRECTORY_NAME}
    install -d ${D}${localstatedir}/lib/${RABBITMQ_DIRECTORY_NAME}

    install -d ${D}/${base_libdir}/systemd/system
    install -m 0644 ${WORKDIR}/rabbitmq.service ${D}/${base_libdir}/systemd/system/

    install -d ${D}/${sysconfdir}/${RABBITMQ_DIRECTORY_NAME}
    install -m 0644 ${WORKDIR}/rabbitmq-env.conf ${D}/${sysconfdir}/${RABBITMQ_DIRECTORY_NAME}/
    install -m 0644 ${WORKDIR}/rabbitmq.config ${D}/${sysconfdir}/${RABBITMQ_DIRECTORY_NAME}/
    install -m 0644 ${WORKDIR}/enabled_plugins ${D}/${sysconfdir}/${RABBITMQ_DIRECTORY_NAME}/

    chown -R rabbitmq:rabbitmq ${D}${localstatedir}/log/${RABBITMQ_DIRECTORY_NAME}
    chown -R rabbitmq:rabbitmq ${D}${localstatedir}/lib/${RABBITMQ_DIRECTORY_NAME}

    mv ${D}/ebin ${RABBIT_LIB_DIR}/ebin
    mv ${D}/include ${RABBIT_LIB_DIR}/include
    mv ${D}/plugins ${RABBIT_LIB_DIR}/plugins
}

inherit useradd systemd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "--system rabbitmq"
USERADD_PARAM_${PN}  = "--system --home ${localstatedir}/lib/${RABBITMQ_DIRECTORY_NAME} -g rabbitmq rabbitmq"

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "rabbitmq.service"

FILES_${PN} += " ${libdir}/rabbitmq/lib/${PN}-${PV}/* \
                 ${localstatedir}/* \ 
                 ${base_libdir}/systemd \
               "

FILES_${PN}-doc += "LICENSE* INSTALL"
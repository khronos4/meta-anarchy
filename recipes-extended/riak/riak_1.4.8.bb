DESCRIPTION = "Riak is a distributed, decentralized data storage system. "
HOMEPAGE = "http://basho.com/riak/"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff253ad767462c46be284da12dda33e8"
SECTION = "network"
DEPENDS = "erlang-native"
PR = "r0"

SRC_URI = "http://s3.amazonaws.com/downloads.basho.com/riak/1.4/${PV}/riak-${PV}.tar.gz \
           "

SRC_URI[md5sum] = "5ad4fb9d7ed409ceefd003ddbab5b046"
SRC_URI[sha256sum] = "69159cefeef48f5ad3ebec02ea4856f7c739e158758405e69c2d001d2d7958d1"

RDEPENDS_${PN} = "erlang erlang-modules"

do_compile() {
    oe_runmake
}

do_install() {
}

inherit useradd systemd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "--system riak"
USERADD_PARAM_${PN}  = "--system --home ${localstatedir}/lib/riak -g riak \
                        --no-create-home riak"

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "rabbitmq.service"

FILES_${PN} += " ${libdir}/riak/lib/${PN}-${PV}/* \
                 ${localstatedir}/* \ 
               "

FILES_${PN}-doc += "LICENSE* INSTALL"
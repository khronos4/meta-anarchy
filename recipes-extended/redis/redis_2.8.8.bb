SUMMARY = "Redis key-value store"
DESCRIPTION = "Redis is an open source, advanced key-value store."
HOMEPAGE = "http://redis.io"
SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM="file://COPYING;md5=6b461289550ee3815f95e4dcef58cc5e"

SRC_URI = "http://download.redis.io/releases/redis-${PV}.tar.gz \
           file://hiredis-use-default-CC-if-it-is-set.patch \
           file://lua-update-Makefile-to-use-environment-build-setting.patch \
           file://oe-use-libc-malloc.patch \
           file://redis.conf \
           file://redis.service \
"

SRC_URI[md5sum] = "f3af82ca88b9d84c81d0b77614d07426"
SRC_URI[sha256sum] = "fd2be11b8d9300d35b6bbed6fcd6fa6d7ef1a72ccaeb0cc991ce44dc49908bc8"

do_install() {
    export PREFIX=${D}/${prefix}
    oe_runmake install

    install -d ${D}/${sysconfdir}/redis
    install -m 0755 ${WORKDIR}/redis.conf ${D}/${sysconfdir}/redis/redis.conf

    install -d ${D}/${base_libdir}/systemd/system
    install -m 0644 ${WORKDIR}/redis.service ${D}/${base_libdir}/systemd/system/

    install -d ${D}/var/lib/redis/
}

inherit systemd

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "redis.service"

FILES_${PN} += " ${libdir}/redis/lib/redis/* \
                 ${localstatedir}/* \ 
                 ${base_libdir}/systemd \
               "

#REDISPORT=6379
#EXEC=/usr/local/bin/redis-server
#CLIEXEC=/usr/local/bin/redis-cli
#
#PIDFILE=/var/run/redis_${REDISPORT}.pid
#CONF="/etc/redis/${REDISPORT}.conf"

#$EXEC $CONF

#PID=$(cat $PIDFILE)
#$CLIEXEC -p $REDISPORT shutdown
#while [ -x /proc/${PID} ]
DESCRIPTION = "ZeroMQ looks like an embeddable networking library but acts like a concurrency framework"
HOMEPAGE = "http://www.zeromq.org"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=d5311495d952062e0e4fbba39cbf3de1"

PR = "r0"

DEPENDS += "util-linux"

SRC_URI = "http://download.zeromq.org/zeromq-${PV}.tar.gz"

inherit autotools

do_configure_prepend() {
	./autogen.sh
}

SRC_URI[md5sum] = "f3c3defbb5ef6cc000ca65e529fdab3b"
SRC_URI[sha256sum] = "1ef71d46e94f33e27dd5a1661ed626cd39be4d2d6967792a275040e34457d399"

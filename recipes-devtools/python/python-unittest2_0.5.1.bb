DESCRIPTION = "The new features in unittest for Python 2.7 backported to Python 2.3+"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=1e48efa493a42c909f0ea0d61af06467"

SRC_URI = "https://pypi.python.org/packages/source/u/unittest2/unittest2-${PV}.tar.gz"
SRC_URI[md5sum] = "a0af5cac92bbbfa0c3b0e99571390e0f"
SRC_URI[sha256sum] = "aa5de8cdf654d843379c97bd1ee240e86356d3355a97b147a6f3f4d149247a71"

SRCNAME = "unittest2"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

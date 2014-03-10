DESCRIPTION = "Pure-Python MySQL Driver"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=8098c977979ae3403fd9e7d43120dc01"

SRC_URI = "https://pypi.python.org/packages/source/P/PyMySQL/PyMySQL-${PV}.tar.gz"
SRC_URI[md5sum] = "125e8a3449e05afcb04874a19673426b"
SRC_URI[sha256sum] = "b141ceb1551fe29c10eab45efcb9eac8c3bb7b04b030045fa8b13b2e8767d8c5"

SRCNAME = "PyMySQL"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

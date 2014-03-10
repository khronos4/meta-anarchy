DESCRIPTION = "Database connections for multi-threaded environments"
SECTION = "devel/python"
LICENSE = "OSL"
LIC_FILES_CHKSUM = "file://setup.py;md5=e9c5aba4e9fbce0bf936370735a4f9eb"

SRC_URI = "https://pypi.python.org/packages/source/D/DBUtils/DBUtils-${PV}.tar.gz"
SRC_URI[md5sum] = "aa13d60db0377234c5f9469212da5022"
SRC_URI[sha256sum] = "d62d1abaafdbd9245a53e9c901f4162125d0258ef8a489233dba4689cea0bff7"

SRCNAME = "DBUtils"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

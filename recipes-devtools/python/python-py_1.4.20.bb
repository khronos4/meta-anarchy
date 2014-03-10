DESCRIPTION = "library with cross-python path, ini-parsing, io, code, log facilities"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

SRC_URI = "https://pypi.python.org/packages/source/p/py/py-${PV}.tar.gz"
SRC_URI[md5sum] = "5f1708be5482f3ff6711dfd6cafd45e0"
SRC_URI[sha256sum] = "23c99d99ebb2a60eb7023b7577bfc988acb0092082257a57189f100ce84b72f1"

SRCNAME = "py"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

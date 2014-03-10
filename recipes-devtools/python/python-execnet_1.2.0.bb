DESCRIPTION = "execnet: rapid multi-Python deployment"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

SRC_URI = "https://pypi.python.org/packages/source/e/execnet/execnet-${PV}.tar.gz"
SRC_URI[md5sum] = "1886d12726b912fc2fd05dfccd7e6432"
SRC_URI[sha256sum] = "951714caa0ae80237f4ffc1f08450e9e2e5f8f902beaf1ad294020875d6f8c2c"

SRCNAME = "execnet"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

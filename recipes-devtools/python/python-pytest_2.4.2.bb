DESCRIPTION = "pytest: simple powerful testing with Python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

SRC_URI = "https://pypi.python.org/packages/source/p/pytest/pytest-${PV}.tar.gz"
SRC_URI[md5sum] = "9ce14429bd9fae08a3d9ae6b7046d9fc"
SRC_URI[sha256sum] = "bccbbed432b1e95381fbb958c27aabcb751ccc337769091de8b7e5cd25ca00e0"

SRCNAME = "pytest"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "python-py"

inherit distutils

BBCLASSEXTEND = "native"

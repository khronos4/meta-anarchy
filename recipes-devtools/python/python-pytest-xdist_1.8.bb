DESCRIPTION = "py.test xdist plugin for distributed testing and loop-on-failing modes"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38ca2d6affb2eab85232b8f778b7f620"

SRC_URI = "https://pypi.python.org/packages/source/p/pytest-xdist/pytest-xdist-${PV}.zip"
SRC_URI[md5sum] = "9c0b8efe9d43b460f8cf049fa46ce14d"
SRC_URI[sha256sum] = "b02135db7080c0978b7ce5d8f43a5879231441c2062a4791bc42b6f98c94fa69"

SRCNAME = "pytest-xdist"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "python-pytest python-execnet"

inherit distutils

BBCLASSEXTEND = "native"

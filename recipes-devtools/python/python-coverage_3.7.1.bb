DESCRIPTION = "Code coverage measurement for Python"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=a7a56ccc954265c2a6382bfd3c40890d"

SRC_URI = "https://pypi.python.org/packages/source/c/coverage/coverage-${PV}.tar.gz"
SRC_URI[md5sum] = "c47b36ceb17eaff3ecfab3bcd347d0df"
SRC_URI[sha256sum] = "d1aea1c4aa61b8366d6a42dd3650622fbf9c634ed24eaf7f379c8b970e5ed44e"

SRCNAME = "coverage"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

#nose
#mock
#tox
#pylint
#sphinx

inherit distutils

BBCLASSEXTEND = "native"

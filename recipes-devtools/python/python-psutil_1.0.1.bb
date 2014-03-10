DESCRIPTION = "A process and system utilities module for Python"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f02e99f7f3c9a7fe8ecfc5d44c2be62"

SRC_URI = "https://pypi.python.org/packages/source/p/psutil/psutil-${PV}.tar.gz"
SRC_URI[md5sum] = "823455a93ff85f284cef0716d1c7a8ce"
SRC_URI[sha256sum] = "ba4c81622434836f6645e8d04e221ca5b22a9bd508c29989407f116b917be5b3"

SRCNAME = "psutil"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

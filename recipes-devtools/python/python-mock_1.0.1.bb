DESCRIPTION = "A Python Mocking and Patching Library for Testing"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80e5ba73891255687dff3bee2b4cbb16"

SRC_URI = "https://pypi.python.org/packages/source/m/mock/mock-${PV}.tar.gz"
SRC_URI[md5sum] = "c3971991738caa55ec7c356bbc154ee2"
SRC_URI[sha256sum] = "b839dd2d9c117c701430c149956918a423a9863b48b09c90e30a6013e7d2f44f"

SRCNAME = "mock"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

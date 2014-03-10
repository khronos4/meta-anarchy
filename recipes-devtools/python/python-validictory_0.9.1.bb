DESCRIPTION = "general purpose python data validator"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b9b8ffeaea6de2d2540b8fdd296c2e43"

SRC_URI = "https://pypi.python.org/packages/source/v/validictory/validictory-${PV}.tar.gz"
SRC_URI[md5sum] = "f521ef655bb4f2c60afcaede190d86c2"
SRC_URI[sha256sum] = "3b8c636dc56114070177bc1c1083e804eec628f6c580ee5cb8e9844e1ead6301"

SRCNAME = "validictory"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

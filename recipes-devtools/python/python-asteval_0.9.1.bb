DESCRIPTION = "Safe, minimalistic evaluator of python expression using ast module"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61bc11657526f6bd83ff828af2de372e"

SRC_URI = "https://pypi.python.org/packages/source/a/asteval/asteval-${PV}.tar.gz"
SRC_URI[md5sum] = "40d8423952abc2001670c792fd87fc39"
SRC_URI[sha256sum] = "dec59ab2c4d66d10f75159d281b53ac891e4df73d55a56aaa21d11006f491429"

SRCNAME = "asteval"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

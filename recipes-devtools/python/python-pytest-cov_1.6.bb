DESCRIPTION = "py.test plugin for coverage reporting with support for both centralised and distributed testing, including subprocesses and multiprocessing"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbc4e25353c748c817db2daffe605e43"

SRC_URI = "https://pypi.python.org/packages/source/p/pytest-cov/pytest-cov-${PV}.tar.gz"
SRC_URI[md5sum] = "6da54d74bde9d200de45068ba2ea637a"
SRC_URI[sha256sum] = "2e803c89f11e0344111670349f6ef401f831e85cbd287b0c5d61917da5aac454"

SRCNAME = "pytest-cov"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "python-pytest python-cov-core"

inherit distutils

BBCLASSEXTEND = "native"

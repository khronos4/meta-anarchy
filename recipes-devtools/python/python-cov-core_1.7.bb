DESCRIPTION = "plugin core for use by pytest-cov, nose-cov and nose2-cov"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbc4e25353c748c817db2daffe605e43"

SRC_URI = "https://pypi.python.org/packages/source/c/cov-core/cov-core-${PV}.tar.gz"
SRC_URI[md5sum] = "59c1e22e636633e10120beacbf45b28c"
SRC_URI[sha256sum] = "8050c226fa73234b88e62630d64e0416c879202891309cbcdbb8b556222c3020"

SRCNAME = "cov-core"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "python-coverage"

inherit distutils

BBCLASSEXTEND = "native"

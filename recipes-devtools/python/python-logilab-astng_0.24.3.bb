DESCRIPTION = "collection of low-level Python packages and modules used by Logilab projects"
SECTION = "devel/python"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "https://pypi.python.org/packages/source/l/logilab-astng/logilab-astng-${PV}.tar.gz"
SRC_URI[md5sum] = "f0dd5dee1d5053939da174e1bfe69388"
SRC_URI[sha256sum] = "e08fba39689e5a4dfa175749874811e516f019656544874defe05154073f69d4"

SRCNAME = "logilab-astng"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "python-logilab-common"

inherit distutils

BBCLASSEXTEND = "native"

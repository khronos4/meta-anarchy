DESCRIPTION = "python code static checker"
SECTION = "devel/python"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

SRC_URI = "https://pypi.python.org/packages/source/p/pylint/pylint-${PV}.tar.gz"
SRC_URI[md5sum] = "1ccd3812c2729b605e5fd9425ef376e6"
SRC_URI[sha256sum] = "310a03c37148e53521cb4ab704bdba0a2a59af091261c89dde3239320f8fa458"

SRCNAME = "pylint"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "python-logilab-common python-logilab-astng"

inherit distutils

BBCLASSEXTEND = "native"

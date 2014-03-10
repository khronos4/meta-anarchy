DESCRIPTION = "collection of low-level Python packages and modules used by Logilab projects"
SECTION = "devel/python"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "https://pypi.python.org/packages/source/l/logilab-common/logilab-common-${PV}.tar.gz"
SRC_URI[md5sum] = "1fb0000b9af74b66cd63919e1c533298"
SRC_URI[sha256sum] = "80fba5ba4908983580a0003fee0c12c270b379e2a21038b609ce8eda4dd3cee7"

SRCNAME = "logilab-common"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

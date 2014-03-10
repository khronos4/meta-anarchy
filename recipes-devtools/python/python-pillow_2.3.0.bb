DESCRIPTION = "Python Imaging Library (Fork)"
SECTION = "devel/python"
LICENSE = "PIL"
LIC_FILES_CHKSUM = "file://docs/LICENSE;md5=f03075aa611d08bd0612dada2baba4cc"

SRC_URI = "https://pypi.python.org/packages/source/P/Pillow/Pillow-${PV}.zip \
		file://setup.patch"

SRC_URI[md5sum] = "56b6614499aacb7d6b5983c4914daea7"
SRC_URI[sha256sum] = "b38e7e32401ae2d949cb4b82c6388cd13e697d1e2f8a1bffce3b834d00fbca13"

SRCNAME = "Pillow"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = "zlib libpng jpeg tiff freetype"

inherit distutils

BBCLASSEXTEND = "native"

DESCRIPTION = "Twitter library for python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=418c75d700d828e72400379b7b1bf221"

SRC_URI = "https://pypi.python.org/packages/source/t/tweepy/tweepy-${PV}.tar.gz"
SRC_URI[md5sum] = "529819cc8a0b283b7b47470ceb06cd16"
SRC_URI[sha256sum] = "557b598b1c241afbe5efc5f28f46326dc58c85efb42270563b33bca3b6e33fc7"

SRCNAME = "tweepy"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} = ""

inherit distutils

BBCLASSEXTEND = "native"

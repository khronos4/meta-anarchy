DESCRIPTION = "cereal - A C++11 library for serialization"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e612690af2f575dfd02e2e91443cea23"

SRC_URI = "git://github.com/USCiLab/cereal.git;tag=v${PV}"

S = "${WORKDIR}/git"

DEPENDS = "boost"

inherit cmake

do_install() {
    install -d ${D}${includedir}
    cp -r -u ${S}/include/* ${D}${includedir}/
}
DESCRIPTION = "Cap’n Proto is an insanely fast data interchange format and capability-based RPC system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2d23f6b6033aaf38b90127ea21ecaf69"

SRC_URI = "http://capnproto.org/capnproto-c++-${PV}.tar.gz"
SRC_URI[md5sum] = "f801c5dc96d9d862d5067a5322b7d437"
SRC_URI[sha256sum] = "77adfbb78f8538a453cb8c9b6e0503c1d21e2877461aa6e60d8fe0486656b3ff"

S = "${WORKDIR}/capnproto-c++-${PV}"

inherit autotools

DESCRIPTION = "libcppa is an LGPL C++11 actor model implementation featuring lightweight & fast actor implementations, pattern matching for messages, network transparent messaging, and more."
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://LICENCE;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/Neverlord/libcppa.git;tag=V${PV} \
           file://CMakeLists.txt.patch \
           file://examples_CMakeLists.txt.patch \
           file://examples_remote_actors_protobuf_broker.cpp.patch \
"

S = "${WORKDIR}/git"

DEPENDS = "boost protobuf protobuf-native"

EXTRA_OECMAKE = "-DLIBCPPA_COMPILER_VERSION=4.8"

inherit cmake
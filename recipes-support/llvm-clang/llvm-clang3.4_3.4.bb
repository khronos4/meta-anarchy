require llvm.inc
require llvm3.inc
require clang3.inc

DEPENDS += "zlib"
EXTRA_OECONF += "--enable-zlib"

SRC_URI_append_libc-uclibc = " file://arm_fenv_uclibc.patch "
SRC_URI[md5sum] = "46ed668a1ce38985120dbf6344cf6116"
SRC_URI[sha256sum] = "25a5612d692c48481b9b397e2b55f4870e447966d66c96d655241702d44a2628"
SRC_URI[clang.md5sum] = "b378f1e2c424e03289effc75268d3d2c"
SRC_URI[clang.sha256sum] = "22a9780db3b85a7f2eb9ea1f7f6e00da0249e3d12851e8dea0f62f1783242b1b"

PACKAGECONFIG ??= ""
PACKAGECONFIG[r600] = "--enable-experimental-targets=R600,,,"

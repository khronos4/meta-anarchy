SRC_URI += "http://llvm.org/releases/${PV}/clang-${PV}.src.tar.gz;name=clang"

do_configure_prepend() {
    cp -r "${WORKDIR}/clang-${PV}" "${WORKDIR}/llvm-${PV}/tools/clang"
}

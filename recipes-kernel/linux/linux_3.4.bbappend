REPLACE_IN = "${WORKDIR}/defconfig"

change_key() {
    if grep -q "$1=" ${REPLACE_IN}; then   
        sed -i "s/\($1=\).*/\1$2/" ${REPLACE_IN}
    else
        echo "$1=$2" >>${REPLACE_IN}
    fi
}

do_configure_prepend() {
    change_key CONFIG_SPI_SUN4I y
    change_key CONFIG_SPI y
    change_key CONFIG_SPI_MASTER y
    change_key CONFIG_EXPERIMENTAL y
    change_key CONFIG_SPI_SPIDEV y
}
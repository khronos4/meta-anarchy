DESCRIPTION = "Anarchy image"
LICENSE = "MIT"

require anarchy-base-image.bb

IMAGE_LINGUAS = "en-gb ru-ru"

DEPENDS += "packagegroup-base-extended \
       "

ANARCHY_LIBRARIES = " \
    opencv opencv-apps opencv-dbg opencv-dev \
    libpoco \
    boost boost-dbg \
    pcl pcl-dev \
    llvm3.3 \
    libcppa \
    cereal \
"

IMAGE_INSTALL += " \
    packagegroup-base-extended \
    strace \
    make binutils autoconf gcc gdb gdbserver \
    mc \
    i2c-tools \
    iptables \
    python python3 \
    perl \
    erlang \
    git \
    cmake \
    vim \
    nano \
    dbus \
    rabbitmq-server \
    ${ANARCHY_LIBRARIES} \
"

IMAGE_FEATURES += "splash package-management debug-tweaks"

LICENSE_FLAGS_WHITELIST = "commercial"

export IMAGE_BASENAME = "anarchy-image"

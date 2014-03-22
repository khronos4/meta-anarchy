DESCRIPTION = "Anarchy image"
LICENSE = "MIT"

require anarchy-base-image.bb

IMAGE_LINGUAS = "en-gb ru-ru"

DEPENDS += "packagegroup-base-extended \
       "

ANARCHY_INSTALL = "opencv libpoco boost pcl" 
ANARCHY_INSTALL += "python python3"

#packagegroup-ros-world dropbear
#task-core-boot task-core-ssh-openssh
IMAGE_INSTALL += " \
    packagegroup-base-extended \
    strace \
    binutils \
    gdbserver \
    mc \
    i2c-tools \
    iptables \
    ${ANARCHY_INSTALL} \                 
"

IMAGE_FEATURES += "splash package-management debug-tweaks"

LICENSE_FLAGS_WHITELIST = "commercial"

export IMAGE_BASENAME = "anarchy-image"

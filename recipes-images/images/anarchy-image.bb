DESCRIPTION = "Anarchy image"

LICENSE = "MIT"

inherit core-image

IMAGE_LINGUAS = " "

ANARCHY_INSTALL = "opencv"

IMAGE_INSTALL = "busybox modutils-initscripts initscripts opkg udev sysvinit netbase base-files base-passwd \
                 ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
                 ${ANARCHY_INSTALL} \
                 strace dropbear binutils \
"

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear hwcodecs"

LICENSE_FLAGS_WHITELIST = "commercial"
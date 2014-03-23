SUMMARY = "Add default user"
DESCRIPTION = "Add default system user"
SECTION = "anarchy"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

inherit useradd

USERADD_PACKAGES = "${PN}"

USERADD_PARAM_${PN} = "-u 1200 -d /home/anarchy -r -s /bin/bash anarchy"
GROUPADD_PARAM_${PN} = "-g 900 anarchy"

do_install () {
    install -d -m 755 ${D}${datadir}/anarchy

    chown -R anarchy ${D}${datadir}/anarchy
    chgrp -R anarchy ${D}${datadir}/anarchy
}

FILES_${PN} = "${datadir}/anarchy/*"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
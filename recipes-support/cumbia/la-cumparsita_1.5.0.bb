include cumbia.inc

DEPENDS = "cumbia cumbia-qtcontrols"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${prefix}"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=qumbia-apps/${BPN} \
"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

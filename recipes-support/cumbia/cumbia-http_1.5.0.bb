include cumbia.inc

DEPENDS = "cumbia-qtcontrols qtnetworkauth qtwebsockets"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${prefix} QT_NO_WIDGETS=1"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=${BPN}"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

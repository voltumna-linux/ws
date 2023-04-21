include cumbia.inc

DEPENDS = "cumbia qwt-qt5 qtx11extras"

EXTRA_QMAKEVARS_PRE += " INSTALL_ROOT=${prefix}"
EXTRA_QMAKEVARS_PRE:class-nativesdk += " INSTALL_ROOT=${prefix} no-opengl=1"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=${BPN} \
	file://disable-doxygen-qtcontrols.patch \
"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

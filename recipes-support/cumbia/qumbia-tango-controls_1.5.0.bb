include cumbia.inc

DEPENDS = "cumbia-tango cumbia-qtcontrols"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${prefix}"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=${BPN} \
	file://fix-header-include.patch \
	file://disable-doxygen-qumbia.patch \
"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

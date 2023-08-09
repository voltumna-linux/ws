include cumbia.inc

DEPENDS = "cumbia cumbia-qtcontrols"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${RECIPE_SYSROOT}${prefix}"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=qumbia-apps/${BPN} \
	file://disable-doxygen-la-cumparsita.patch"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

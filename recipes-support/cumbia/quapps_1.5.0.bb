include cumbia.inc

DEPENDS = "qumbia-tango-controls"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${prefix}"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=qumbia-apps/${BPN} \
	file://disable-doxygen-quapps.patch \
	file://avoid-dummy-installation.patch \
"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

ALLOW_EMPTY:${PN} = "1"

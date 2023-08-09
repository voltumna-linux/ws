include cumbia.inc

DEPENDS = "doxygen-native qtxmlpatterns"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${prefix}"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=qumbia-apps/${BPN} \
	file://disable-doxygen-cuuimake.patch"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

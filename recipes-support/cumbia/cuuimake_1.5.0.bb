# DESCRIPTION = "Generic purpose C++ multi threaded library, C++ Tango and \
# Epics modules, Qt components for control system graphical user interfaces"
HOMEPAGE = "https://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

DEPENDS = "qtxmlpatterns"

EXTRA_QMAKEVARS_PRE += "INSTALL_ROOT=${prefix}"

SRCREV = "8a38a38f1f4ea9c7248675a5fb88d408d1a286a2"
SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=qumbia-apps/${BPN} \
	file://disable-doxygen-cuuimake.patch \
"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig qmake5

BBCLASSEXTEND = "nativesdk"

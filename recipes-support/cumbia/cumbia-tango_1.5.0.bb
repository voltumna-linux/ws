include cumbia.inc

DEPENDS = "cumbia cpptango"

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=${BPN} \
	file://exclude-absolute-include-path-tango.patch \
"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig meson

BBCLASSEXTEND = "nativesdk"

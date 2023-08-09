include cumbia.inc

SRC_URI = "git://github.com/ELETTRA-SincrotroneTrieste/cumbia-libs.git;protocol=https;branch=master;subpath=${BPN}"

S = "${WORKDIR}/${BPN}"

inherit pkgconfig meson

BBCLASSEXTEND = "nativesdk"

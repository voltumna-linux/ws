require recipes-core/images/voltumna-sde.bb
require include/ws.inc

IMAGE_INSTALL:append = " packagegroup-core-boot \
	packagegroup-core-x11 packagegroup-xfce-base \
	packagegroup-qt5-toolchain-target \
	qwt-qt5-dev qumbia-tango-controls-dev \
	qtbase-tools cuuimake quapps-dev cumbia-http-dev \
"

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="Work Station (Development)"
	MACHINE="${MACHINE}"
	__EOF__
}

SYSTEMD_DEFAULT_TARGET = "graphical.target"

inherit features_check
REQUIRED_DISTRO_FEATURES = "x11"

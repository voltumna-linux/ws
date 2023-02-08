require recipes-core/images/voltumna-sdk.inc
require recipes-core/images/elettra-sdk.inc
require include/ws.inc

IMAGE_INSTALL:append = " packagegroup-core-boot \
	packagegroup-core-x11 packagegroup-xfce-base \
	packagegroup-qt5-toolchain-target \
	qwt-qt5-dev qumbia-tango-controls-dev \
	qtbase-tools cuuimake quapps-dev cumbia-http-dev \
"

# TODO nativesdk-python3-pyqt5 nativesdk-la-cumparsita
TOOLCHAIN_HOST_TASK:append = " nativesdk-pogo nativesdk-jive \
	nativesdk-python3-pytango \
	nativesdk-packagegroup-qt5-toolchain-host \
	nativesdk-qwt-qt5-dev nativesdk-qumbia-tango-controls-dev \
	nativesdk-qtbase-tools nativesdk-cuuimake nativesdk-quapps-dev \
	nativesdk-cumbia-http-dev \
"

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="Work Station (Cross Development)"
	MACHINE="${MACHINE}"
	__EOF__
}

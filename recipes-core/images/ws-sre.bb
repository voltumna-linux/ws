require recipes-core/images/voltumna-sre.inc
require include/ws.inc

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="Work Station (Runtime)"
	MACHINE="${MACHINE}"
	__EOF__
}

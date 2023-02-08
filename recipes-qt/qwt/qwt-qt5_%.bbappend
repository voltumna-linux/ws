do_configure:prepend:class-nativesdk() {
	sed -i '/QwtOpenGL/d' ${S}/qwtconfig.pri
}

BBCLASSEXTEND = "nativesdk"

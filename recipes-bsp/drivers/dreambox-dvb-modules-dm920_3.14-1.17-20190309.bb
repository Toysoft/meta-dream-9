KV = "3.14-1.17"
DRIVERDATE = "20190309"

require dreambox-dvb-modules-new.inc

SRC_URI[dm920.md5sum] = "d031f1d802b1e9999a783de94d85378d"
SRC_URI[dm920.sha256sum] = "e0907750de9043ebb05433c6b7089fe6f9dba4ae85b128660c935cefec8d50fb"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"

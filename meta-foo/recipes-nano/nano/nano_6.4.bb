# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.DOC
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
                    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"
LICENSE = "GPLv3_CHI"
SRC_URI = "https://nano-editor.org/dist/v6/nano-${PV}.tar.xz"
SRC_URI[md5sum] = "3aecde9eb04e5027eca2d0dc67bf3a3b"
SRC_URI[sha1sum] = "a1f796e5bd16858748804c978d80860b9638a11c"
SRC_URI[sha256sum] = "4199ae8ca78a7796de56de1a41b821dc47912c0307e9816b56cc317df34661c0"
SRC_URI[sha384sum] = "60ab218450f3db5e5afcbbab01907348a63615f854fa391098a99ea5648e36b64e73b38042bd05d8525441974ef45a37"
SRC_URI[sha512sum] = "cff2d9d90f1a23ab8905320e651f8bbc9d38046153a4f64bbc21927687d9628135915468b00b28f88a0eb7d395d1bcb0b9b7abcf367e5a46a5f3da01d8d6e72b"

# NOTE: the following library dependencies are unknown, ignoring: curses
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "file zlib ncurses"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig gettext autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""


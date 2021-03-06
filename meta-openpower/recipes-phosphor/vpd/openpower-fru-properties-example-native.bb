SUMMARY = "FRU properties config for openpower-vpd-parser"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${OPENPOWERBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"

inherit native
inherit openpower-fru-vpd

SRC_URI += "file://example.yaml"

PROVIDES += "virtual/openpower-fru-properties"

S = "${WORKDIR}"

do_install() {
        # This recipe is supposed to create an output yaml file with
        # FRU property values extracted from the MRW. This example recipe
        # provides a sample output file.

        DEST=${D}${properties_datadir}
        install -d ${DEST}
        install example.yaml ${DEST}/out.yaml
}

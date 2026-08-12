package ders4.alistirmalar

import ders4.pratikler.ortak.cekilisRaporuOlustur
import ders4.pratikler.ortak.davetliEkle

fun main() {

    val davetliMisafir = mutableSetOf<String>()

    davetliEkle(davetliMisafir)
    cekilisRaporuOlustur(davetliMisafir)


}
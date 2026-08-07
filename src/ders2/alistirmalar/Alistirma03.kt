package ders2.alistirmalar

import ders2.ortak.daireAlaniHesapla

fun main() {

    print("Yarıçap girin:")
    val yariCap =readln().toIntOrNull() ?: 0

    print(daireAlaniHesapla(yariCap))


}

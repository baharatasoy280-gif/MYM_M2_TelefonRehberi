package ders2

import ders1.cizgicek

fun main() {


    kahveSiparisiAl("Filtre Kahve")
    cizgicek()
    kahveSiparisiAl("Türk Kahvesi","Şekersiz")


}

fun kahveSiparisiAl(kahveTuru: String, sekerMiktari: String = "Orta", sutlu: Boolean = false) {
    println("Sipariş: $kahveTuru, Şeker Miktarı: $sekerMiktari, Sütlü mü: $sutlu")


}
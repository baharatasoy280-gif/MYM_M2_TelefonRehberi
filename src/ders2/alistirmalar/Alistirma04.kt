package ders2.alistirmalar

import ders2.ortak.sistemUyarisi

fun main() {

    print("Sistem mesajını girin:")
    val sistemMesaji = readln().trim()

    print("Bu mesaj bie hata içeriyor mu ? E/H")
    val hataIceriyorMu = readln().trim().lowercase() == "e"
    println("Hata kodu giriniz (boş bırakmak için entere'a basınız)")

    val hataKodu = readln().toIntOrNull()
    if (hataKodu == null) {
        sistemUyarisi(sistemMesaji, hataIceriyorMu)
    } else {
        sistemUyarisi(sistemMesaji, hataIceriyorMu, hataKodu)
    }

}
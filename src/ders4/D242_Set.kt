package ders4

fun main() {

    val cekilisKatilimcilari = mutableSetOf<String>()

    cekilisKatilimcilari.add("Bahar")
    cekilisKatilimcilari.add("Kerem")
    cekilisKatilimcilari.add("Kerem")
    cekilisKatilimcilari.add("Kerem")

    println(cekilisKatilimcilari)


    val katilimciListesi = cekilisKatilimcilari.toList()

    println("Listenin İlk Elemanı: ${katilimciListesi[0]}")

    val ogrenciListesi = mutableListOf<String>()

    ogrenciListesi.add("Melek")
    ogrenciListesi.add("Mert")
    ogrenciListesi.add("Deniz")
    ogrenciListesi.add("Melek")

    println("Öğrenci listesi: $ogrenciListesi")

    val ogrenciSet = ogrenciListesi.toSet()
    println("Öğrenci Seti: $ogrenciSet")
}
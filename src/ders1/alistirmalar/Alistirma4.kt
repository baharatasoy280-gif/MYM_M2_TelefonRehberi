package ders1.alistirmalar

fun main() {
    println("Bir sayı girin: ")
    val sayi = readln().toIntOrNull() ?: 0

    val sonuc = ciftMi(sayi)
    if (sonuc) {
        println("Girilen $sayi sayisi çift")

    } else {
        println("Girilen $sayi sayisi tek")

    }
}

fun ciftMi(sayi: Int): Boolean {
    return sayi % 2 == 0
}
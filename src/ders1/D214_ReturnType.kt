package ders1

fun main() {
    print("Doğum yılınızı girin:")
    val dogumYili = readln().toInt()
    val yas = yasHesapla(dogumYili)
    println("Yaşınız: $yas")
}

fun yasHesapla(dogumYili: Int): Int {
    val yas = 2026 - dogumYili
    return yas
}
package ders1.pratikler

fun main() {
    println("--- 🔢 TEK / ÇİFT KONTROL MERKEZİ ---")

    print("Lütfen bir tam sayı giriniz: ")
    val girilenSayi = readln().toIntOrNull() ?: 0

    val ciftDurumu = ciftMi(girilenSayi)

    if (ciftDurumu == true) {
        println("🎯 Mükemmel! Girdiğiniz '$girilenSayi' sayısı ÇİFT bir sayıdır.")
    } else {
        println("✨ Harika! Girdiğiniz '$girilenSayi' sayısı TEK bir sayıdır.")
    }
}

fun ciftMi(sayi: Int): Boolean {
    return sayi % 2 == 0
}
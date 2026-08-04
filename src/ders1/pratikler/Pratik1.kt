package ders1.pratikler


fun main() {
    println("--- 🏦 LEADER BANK SİSTEMİ ---")

    print("Lütfen adınızı giriniz: ")
    val girilenIsim = readln()


    val isim = if (girilenIsim.isNotBlank()) girilenIsim else "Değerli Müşterimiz"

    telifKartiYazdir(isim)
}

fun telifKartiYazdir(kullaniciAdi: String) {
    println("************************************************")
    println("© 2026 Leader Bank Tüm Hakları Saklıdır.")
    println("Bu sistem $kullaniciAdi adına özel lisanslanmıştır.")
    println("************************************************")
}
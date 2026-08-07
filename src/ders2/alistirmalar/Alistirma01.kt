package ders2.alistirmalar

fun main() {
    print("ürünün fiyatını giriniz:")
    val fiyat = readln().toDoubleOrNull() ?: 0.0

    val sonuc = sepetimiHesapla(fiyat)

    println(sonuc)

}

fun sepetimiHesapla(urununFiyati: Double, kdv: Double = 0.18, kargoUcreti: Double = 29.90): Double {
    val kdvliFiyat = urununFiyati * urununFiyati
    return kdvliFiyat + kargoUcreti
}
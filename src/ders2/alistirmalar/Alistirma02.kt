package ders2.alistirmalar

fun main() {
    print("Satın aldıgınız ürünün fiyatını ondalıklı olarak girin:")
    val fiyat = readln().toDoubleOrNull() ?: 0.0

    print("Ücretsiz kargo kuponunuz var mı ? (E/H)")
    val kuponVarmi = readln().trim().uppercase() == "E"


    val toplamTutar = if (kuponVarmi) {
        sepetimiHesapla(fiyat, kargoUcreti = 0.0)

    } else {
        sepetimiHesapla(fiyat)
    }
}
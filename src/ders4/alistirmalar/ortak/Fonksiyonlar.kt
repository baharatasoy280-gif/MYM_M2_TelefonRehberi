package ders4.alistirmalar.ortak

import ders1.cizgicek

/** Ders4-Alıştırma Fonksiyonları*/
fun davetliEkle(davetliler: MutableSet<String>) {
    println("5 davetli ismi giriniz:")

    for (i in 1..5) {
        print("$i. davetli adı:")
        val isim = readln().trim()

        if (isim.isNotEmpty()) {
            davetliler.add(isim)
        }

    }

}

fun kisiKayitliMi(davetliler: Set<String>, arananIsim: String) = davetliler.contains(arananIsim)


fun rastgeleTalihliSec(davetliler: Set<String>): String {

    val davetliListesi = davetliler.toList()
    return davetliListesi.random()

}

fun cekilisRaporuOlustur(davetliler: Set<String>) {
    print("**ÇEKİLİŞ RAPORU**")

    print("Toplam Kayıtlı Davetli Sayısı: ${davetliler.size}")

    println("Kurada olup olmadığını kontrol etmek istediğiniz ismi giriniz:")
    val aranan = readln().trim()


    val kayitVarmi = kisiKayitliMi(davetliler, aranan)

    if (kayitVarmi) {
        print("Evet, $aranan davetli listede var.")
    } else {
        print("Hayır, $aranan davetli listede bulunamadı.")
    }

    if (davetliler.isNotEmpty()) {
        val talihli = rastgeleTalihliSec(davetliler)
        println("Şanslı Talihli: $talihli")
    } else {
        print("Çekiliş yapılacak davetli bulunamadı.")
    }
}


fun sozlukUygulamasi(sozluk: MutableMap<String, String>) {

    print("İngilizce bir kelime giriniz:")
    val kelime = readln().trim().lowercase()
    if (kelime.isEmpty()) {
        print("Boş kelime aratılmaz.")
    } else if (sozluk.contains(kelime)) {
        print("Türkçe karşılığı: $sozluk")

    } else {
        print("Bu kelime sözlükte yok")
        println("$kelime kelimesinin türkçe anlamını girin:")
        val anlam = readln().trim().lowercase()
        if (anlam.isNotEmpty()) {
            sozluk[kelime] = anlam
            println("Yeni kelime sözlüğe eklendi \n $kelime")
        }
    }

}


fun urunIsimleriniYazdir(urunler: Map<String, Double>) {
    println("Dükkandaki Ürünler: ${urunler.keys}")

}

fun toplamKasaDegeriniHesapla(urunler: Map<String, Double>): Double {
    var toplamFiyat = 0.0
    for (fiyat in urunler.values) {
        toplamFiyat += fiyat

    }
    return toplamFiyat

}

fun detaylilisteYazdir(urunler: Map<String, Double>) {
    for ((urun, fiyat) in urunler) {
        println("ürün adı: $urun,ürün fiyatı: $fiyat")
    }
}

fun envanterRaporu(urunler: Map<String, Double>) {
    cizgicek()
    println("Envanter ve Kasa Raporu")
    urunIsimleriniYazdir(urunler)

    toplamKasaDegeriniHesapla(urunler)
    detaylilisteYazdir(urunler)

    val kasaDegeri = toplamKasaDegeriniHesapla(urunler)
    println("Toplam Kasa Değeri:$kasaDegeri TL")
    detaylilisteYazdir(urunler)


}

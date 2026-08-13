package ders05.ortak

import ders1.cizgicek


fun menuyuGoster() {
    println(
        """
      
        --- TELEFON REHBERİ ---
        1. Kişi Ekle
        2. Kişi Bul
        3. Tüm Rehberi Listele
        4. Çıkış
    """.trimIndent()
    )
    print("Seçiminiz: ")
}

fun isimFormatla(isim: String): String {
    val trimliIsim = isim.trim().lowercase()
    return trimliIsim
}

fun kisiEkle(rehber: MutableMap<String, String>) {
    print("Eklenecek kişinin adı: ")
    var kisiAdi = readln()
    kisiAdi = isimFormatla(kisiAdi)
    print("Telefon Numarası: ")
    val numara = readln().trim()


    if (kisiAdi.isEmpty() || numara.isEmpty()) {
        println("Hata: İsim veya telefon numarası boş bırakılamaz!")
    } else {
        val buyukIsim =kisiAdi.replaceFirstChar { it.uppercase() }

        if (rehber.containsKey(kisiAdi)) {
            println("$buyukIsim zaten kayıtlıydı.Numarası güncellendi")
        } else {
            println("$buyukIsim rehbere eklendi")
        }

        rehber[kisiAdi] = numara

    }

}

fun kisiBul(rehber: Map<String, String>) {
    println("Kimin numarasını arıyorsunuz?: ")
    var arananKisi = readln()
    arananKisi = isimFormatla(arananKisi)

    if (arananKisi.isEmpty()) {
        println(" Hata: Arama yapabilmek için bir isim girmelisiniz!")
    } else {

        if (rehber.containsKey(arananKisi)) {
            val numara = rehber[arananKisi]
            println("Sonuç:${arananKisi.replaceFirstChar { it.uppercase() }} = $numara")
        } else {
            println("Hata: Kişi bulunamadı!")
        }

    }

}

fun rehberiListele(rehber: Map<String, String>) {

    if (rehber.isEmpty()) {
        println("Uyarı: Rehberiniz henüz boş. İlk önce kişi ekleyin!")
    } else {
        println("\n--- KAYITLI KİŞİLER ---")
        for ((kisi, numara) in rehber) {
            println("${kisi.replaceFirstChar { it.uppercase()}} -> $numara")
        }
       cizgicek()

    }

}







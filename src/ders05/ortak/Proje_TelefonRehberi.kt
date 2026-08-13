package ders05.ortak

fun main() {

    val telefonRehberi = mutableMapOf<String, String>()

    while (true) {

        menuyuGoster()
        val secim = readln()

        when (secim) {
            "1" -> kisiEkle(telefonRehberi)
            "2" -> kisiBul(telefonRehberi)
            "3" -> rehberiListele(telefonRehberi)
            "4" -> {
                println("İyi günler dileriz! ")
                break

            }

            else -> {
                println("Hata: Geçersiz işlem! Lütfen 1 ile 4 arasında bir tuşlama yapın.")
            }

        }

    }


}
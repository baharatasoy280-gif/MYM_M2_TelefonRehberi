package ders2

fun main() {

    profilOlustur("Bahar", "Atasoy", bultenAboneligi = true)
    profilOlustur(
        ad = "Bahar",
        soyad = "Atasoy",
        bultenAboneligi = true
    )

}

fun profilOlustur(ad: String, soyad: String, yas: Int = 21, bultenAboneligi: Boolean = true) {

    println("Kullanıcı: $ad $soyad, Yaş: $yas, Bülten: $bultenAboneligi")
}
package ders2

fun main() {

    uygulamayaGiris("Bahar")
    uygulamayaGiris("Kerem","Web")


}

fun uygulamayaGiris(kullaniciAdi: String, cihazTipi: String = "Mobil") {
    println("Hoşgeldin $kullaniciAdi! ($cihazTipi üzerinden bağlandın)")
}
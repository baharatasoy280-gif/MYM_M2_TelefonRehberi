package ders1.alistirma

fun main() {

    println("Lütfen adınızı giriniz:")
    val girilenIsim = readln().trim()

    val isim = if (girilenIsim.isEmpty()) "Bilinmeyen isim" else girilenIsim

    sistemBilgisiGoster(isim)


}

fun sistemBilgisiGoster(gelistiriciAdi: String) {
    println("*Uygulama Bilgileri*")
    println("lEADER BANK MOBİLE")
    println("Geliştirici: $gelistiriciAdi")

}
package ders1

fun main() {

    urunFiyatiGoster("Kalem",55.00)
    urunFiyatiGoster("Defter",30.00)


}

fun urunFiyatiGoster(urunAdi: String, fiyat: Double){
    println("Seçtiğiniz ürün: $urunAdi, Fiyat: $fiyat TL")

}
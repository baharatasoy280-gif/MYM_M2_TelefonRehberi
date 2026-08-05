package ders2

fun main() {

    var sayininKaresi = kareHesapla(5)
    print("Sayının karesi: $sayininKaresi")

    sayininKaresi = kareHesaplaKisa(7)
    println("Sayının karesi: $sayininKaresi")
}

fun kareHesapla(sayi: Int): Int {
    return sayi * sayi
}

fun kareHesaplaKisa(sayi: Int) = sayi * sayi


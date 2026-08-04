package ders1.alistirmalar

import ders1.pratikler.skorTablosuYazdir

fun main() {

    print("Oyuncu adını giriniz:")
    val ad = readln().trim()

    val oyuncuAdi = if (ad.isEmpty()) "Misafir Oyuncu" else ad


    print("Skorunuzu giriniz:")
    val skor = readln().toIntOrNull() ?: 0

    skorTablosu(oyuncuAdi)

}

fun skorTablosu(isim: String){
    println("""
        Kullanıcı adı: $isim
        Skor tablosu: 
     
        
    """.trimIndent())
}



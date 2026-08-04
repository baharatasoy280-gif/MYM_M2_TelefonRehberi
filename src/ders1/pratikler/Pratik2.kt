package ders1.pratikler
fun main() {
    println("--- 🎮 OYUNCU SKOR SİSTEMİ ---")

    print("Oyuncu adını giriniz: ")
    val oyuncuAdiGirdisi = readln()
    val oyuncuAdi = if (oyuncuAdiGirdisi.isNotBlank()) oyuncuAdiGirdisi else "Bilinmeyen Oyuncu"

    print("Kazandığınız puanı giriniz: ")

    val skor = readln().toIntOrNull() ?: 0

    skorTablosuYazdir(oyuncuAdi, skor)
}

fun skorTablosuYazdir(ad: String, puan: Int) {
    println("=====================================")
    println("🏆 OYUNCU SKOR KARTI")
    println("=====================================")
    println("👤 Oyuncu : $ad")
    println("⭐ Puan   : $puan")
    println("=====================================")
}
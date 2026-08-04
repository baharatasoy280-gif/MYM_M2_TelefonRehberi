package ders1.pratikler

fun main() {
    println("--- 🧮 KARE HESAPLAMA MOTORU ---")

    print("Lütfen bir sınır sayısı giriniz (Örn: 5): ")
    val sinir = readln().toIntOrNull() ?: 1

    println("1'den $sinir sayısına kadar olan kareler:")

    for (i in 1..sinir) {

        val sonuc = kareHesapla(i)

        println("$i sayısının karesi -> $sonuc")
    }
}


fun kareHesapla(sayi: Int): Int {
    val kare = sayi * sayi
    return kare
}
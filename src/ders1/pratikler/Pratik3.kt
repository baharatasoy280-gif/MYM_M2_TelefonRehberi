package ders1.pratikler

fun main() {
    println("--- 📐 DİKDÖRTGEN ALAN HESAPLAYICI ---")

    print("Birinci kenar uzunluğunu giriniz (Örn: 5.5): ")
    val kenar1 = readln().toDoubleOrNull() ?: 0.0

    print("İkinci kenar uzunluğunu giriniz (Örn: 4.2): ")
    val kenar2 = readln().toDoubleOrNull() ?: 0.0

    val hesaplananAlan = alanHesapla(kenar1, kenar2)


    println("✅ Dikdörtgenin Alanı: $hesaplananAlan")
}


fun alanHesapla(uzunluk: Double, genislik: Double): Double {
    val alan = uzunluk * genislik

    return alan
}
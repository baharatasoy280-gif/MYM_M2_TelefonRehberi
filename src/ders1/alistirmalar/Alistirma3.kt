package ders1.alistirmalar

fun main() {

    println("Kısa kenar uzunlugunu giriniz:")
    val kisaKenar = readln().toDoubleOrNull() ?: 1.0

    println("Uzun kenar uzunluğunu giriniz:")
    val uzunKenar = readln().toDoubleOrNull() ?: 1.0


    println(dikdorgenAlanHesapla(uzunKenar,kisaKenar)
    )

}

fun dikdorgenAlanHesapla(kenar1: Double, kenar2: Double): Double {
    return kenar1 * kenar2
}
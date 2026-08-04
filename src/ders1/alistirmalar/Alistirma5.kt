package ders1.alistirmalar

fun main() {
    println("Sınır sayısı girin:")
    val sinirSayisi = readln().toIntOrNull() ?: 0

    for (i in 1..sinirSayisi) {
        val kareDegeri = kareAl(i)
        println("$i sayisinin  kare değeri:$kareDegeri")
    }

}


fun kareAl(sayi: Int): Int {
    return sayi * sayi

}
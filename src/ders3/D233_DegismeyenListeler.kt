package ders3

fun main() {


    val zorlukSeviyeleri = listOf("Kolay", "Orta", "Zor")

    print(zorlukSeviyeleri[0].uppercase())

    // zorlukSeviyeleri.add("Efsanevi") //HATA: Ekleme yapılamaz.

    //  zorlukSeviyeleri[2] = "Efsanevi" //HATA: Değer değiştirilemez


    println(zorlukSeviyeleri.size)

    println(zorlukSeviyeleri.isEmpty())
}
package ders3

fun main() {
    //İÇİ DOLU ARRAY

    val gunler = arrayOf("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar")

    println(gunler[2])
    println(gunler[2].uppercase())
    val carsamba = gunler[2]


    gunler[6] = "PAZAR"
    println(gunler[6])

    // Hata sınır dışı/ println(gunler[7])


    //İÇİ BOŞ ARRAY

    val isimler = arrayOfNulls<String>(3)
    isimler[0] = "Ali"
    isimler[1] = "Bahar"

    println(isimler.contentToString())

    val sayilar = IntArray(3)
    println(sayilar.contentToString())

    val ondaliklisayilar = DoubleArray(3)
    println(ondaliklisayilar.contentToString())


    //Array'lerde döngü kullanımı
    println(gunler.joinToString(" | "))

    for (gun in gunler) {
        println(gun.uppercase())

    }

}
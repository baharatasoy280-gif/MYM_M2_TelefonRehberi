package ders3

fun main() {

    val alisverisSepeti = mutableListOf<String>()


    alisverisSepeti.add("Kalem")
    alisverisSepeti.add("Defter")
    alisverisSepeti.add("Silgi")

    println("Alışveriş Sepeti: $alisverisSepeti")

    alisverisSepeti.add(1, "Çanta")
    println("Alışveriş Sepeti: $alisverisSepeti")

    alisverisSepeti.shuffle()
    println("Alşveriş Sepeti: $alisverisSepeti")

    alisverisSepeti.remove("Defter")
    println("Alışveriş Sepeti: $alisverisSepeti")

    alisverisSepeti.removeAt(2)
    println("Alışveriş Sepeti: $alisverisSepeti")

    println(alisverisSepeti.remove("Çanta"))
    println("Alışveriş Sepeti: $alisverisSepeti")


    alisverisSepeti.clear()
    println("Alışveriş Sepeti: $alisverisSepeti")




}

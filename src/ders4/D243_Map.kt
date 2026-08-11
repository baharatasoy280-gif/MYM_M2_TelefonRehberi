package ders4

import kotlin.coroutines.CoroutineContext

fun main() {


    val sinavNotlari = mutableMapOf<String, Int>()

    sinavNotlari["Matematik"] = 95
    sinavNotlari["Biyoloji"] = 80
    sinavNotlari["Türkçe"] = 78

    sinavNotlari["Türkçe"] = 100

    println(sinavNotlari)

    for ((key, value) in sinavNotlari) {
        println("Ders Adı: $key, Not: $value")
    }

    println(sinavNotlari)


    val sehirPlakalari = mapOf(

        "istanbul" to "34",
        "Zonguldak " to "67",
        "Ankara" to "06"

    )


}
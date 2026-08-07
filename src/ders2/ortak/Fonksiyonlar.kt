package ders2.ortak

import java.security.Key


fun daireAlaniHesapla(yaricap: Int) = 3.14 * yaricap * yaricap


fun sistemUyarisi(mesaj: String, hataliMi: Boolean = false, hataKey: Int = 404) {
    val durumMesaji = if (hataliMi) "hata " else "Bilgi mesaji"
    print("$durumMesaji $hataKey")
}


fun kareHesapla(sayi: Int) = sayi * sayi


fun hipotenusKaresiHesapla(a: Int, b: Int): Int {
    val aninKaresi = kareHesapla(a)
    val bninKaresi = kareHesapla(b)

    return aninKaresi + bninKaresi
}
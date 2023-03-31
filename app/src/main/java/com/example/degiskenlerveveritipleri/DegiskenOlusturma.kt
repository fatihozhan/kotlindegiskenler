package com.example.degiskenlerveveritipleri

fun main(){
    var ogrenciAdi = "Fatih";
    var yas = 24.9;
    var ogrenciBoy = 1.80;
    var ogrenciBasHarf = "a"
    println(ogrenciAdi)
    println(yas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)


    var urunId : Int = 3425
    var urunAdi : String ="Kol Saati"
    var urunAdet : Int = 100
    var urunFiyar : Double = 109.90
    var urunDetarikci : String = "Rolex"

    println("Ürün ID ${urunId}")
    println("Ürün Adı ${urunAdi}")
    println("Ürün Adeti ${urunAdet}")
    println("Ürün Fiyatı ${urunFiyar}")
    println("Ürün Tedarikçisi ${urunDetarikci}")

    println("${ogrenciAdi} ${yas} yaşında ve Acıgölde yıllardır yaşamaktadır.")

    println("$urunAdet ve $urunFiyar toplamı ${urunAdet + urunFiyar}")

}

package com.example.degiskenlerveveritipleri

fun main() {
    var i: Int = 42
    var d: Double = 43.52
    var f: Float = 42.89f

    var sonuc1: Int = d.toInt()
    var sonuc2: Double = i.toDouble()
    var sonuc3: Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)


    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    //Yöntem 1

    var yazi1 = "34t"

    try {
        var x = yazi1.toInt()
        println(x)
    } catch (e: Exception) {
        println("Dönüşümde hata var $e")
    }

    //Yöntem 2
    println("İkinci yöntem")
    var yazi2 = "49.33"
    var y = yazi2.toDoubleOrNull()

    if (y != null) {
        println("y : $y")
    } else {
        println("Dönüşümde Hata Var Üstadım")
    }
    println("Üçüncü Yöntem")

    //Yöntem 3

    var yazi3 = "65"

    var z = yazi3.toIntOrNull()

    z?.let {
        println("z : $z")
    }

}
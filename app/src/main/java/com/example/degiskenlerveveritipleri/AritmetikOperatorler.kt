package com.example.degiskenlerveveritipleri

fun main() {
    val pi = 3.14

    var yariCap = 2.0

    var alan = pi * yariCap * yariCap

    println("Daire Alanı : $alan")

    var m = 12.5
    var a = 10.0
    var f = m * a
    println("F : $f")

    var v = 12.7
    var v0 = 23.56
    var t = 3.5

    var x1 = ((v + v0) / 2) * t
    println("x1 : $x1")

    var x2 = (v0 * t) + (a * t * t) / 2
    println("x2 : $x2")

    //kısaltmalara

    var y = 10
    y = y + 10
    println(y)

    y += 2
    println(y)
    y -= 2

    println(y)

    y *=2
    println(y)

}
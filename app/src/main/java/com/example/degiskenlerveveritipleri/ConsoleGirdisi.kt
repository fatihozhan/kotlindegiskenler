package com.example.degiskenlerveveritipleri

import java.util.Scanner


fun main() {
    println("Adını Giriniz")

    val girdi = Scanner(System.`in`)

    val ad = girdi.next()
    var sayi = girdi.nextInt()
    println("Adını : $ad")
    println("Sayınız : $sayi")

}
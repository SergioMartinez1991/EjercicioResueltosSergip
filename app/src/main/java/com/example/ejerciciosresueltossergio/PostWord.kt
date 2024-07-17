package com.example.ejerciciosresueltossergio

fun esPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        if (numero % i == 0) return false
    }
    return true
}

fun main() {
    println("¿Es 17 primo? ${esPrimo(17)}")
    println("¿Es 24 primo? ${esPrimo(24)}")
}
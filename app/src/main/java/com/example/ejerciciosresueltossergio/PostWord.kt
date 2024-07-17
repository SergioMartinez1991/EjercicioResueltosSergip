package com.example.ejerciciosresueltossergio

import kotlin.math.PI

fun calcularVolumenCilindro(radio: Double, altura: Double): Double {
    return PI * radio * radio * altura
}

fun main() {
    println("Volumen del cilindro: ${calcularVolumenCilindro(5.0, 10.0)}")
}
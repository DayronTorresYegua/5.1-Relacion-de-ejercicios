package org.example.figurasGeometricas

class Circulo(color: String, val radio: Double): Figura(color) {

    override fun area() = Math.PI * radio * radio

    override fun perimetro() = 2 * Math.PI * radio

}
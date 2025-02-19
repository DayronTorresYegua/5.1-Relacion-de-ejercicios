package org.example.figurasGeometricas

class Rectangulo(color: String, val base: Double, val altura: Double): Figura(color) {

    override fun area() = base * altura

    override fun perimetro() = 2 * (base + altura)
}
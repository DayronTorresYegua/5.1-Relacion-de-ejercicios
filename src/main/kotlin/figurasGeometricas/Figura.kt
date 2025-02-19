package org.example.figurasGeometricas

abstract class Figura(val color: String) {

    abstract fun area(): Double
    abstract fun perimetro(): Double

    override fun toString(): String {
        return "Color: $color, Área: ${area()}, Perímetro: ${perimetro()}"
    }

}

package org.example.dispositivosElectronicos

class Coche : Vehiculo, EncendidoApagado {

    override var motorEncendido = false
    override var kmHora = 0

    override fun encender() {
        if (!motorEncendido) {
            motorEncendido = true
            println("motorEncendido")
        } else {
            println("motorEncendido ya está encendido")
        }
    }

    override fun apagar() {
        if (motorEncendido) {
            motorEncendido = false
            println("motorEncendido apagado")
        }
    }

    override fun acelerar(aumento: Int) {
        if (motorEncendido) {
            kmHora += aumento
            println("Coche acelerando. Velocidad: $kmHora km/h.")
        } else {
            println("No se puede acelerar. El motor está apagado.")
        }
    }

    override fun frenar(disminucion: Int) {
        kmHora = (kmHora - disminucion).coerceAtLeast(0)
        println("Coche frenando. Velocidad: $kmHora km/h.")
    }
}
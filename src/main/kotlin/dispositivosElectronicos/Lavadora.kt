package org.example.dispositivosElectronicos

class Lavadora: EncendidoApagado {

    private var encendida: Boolean = false

    override fun encender() {
        if (!encendida) {
            encendida = true
            println("Lavadora encendida")
        } else {
            println("La lavadora ya está encendida")
        }
    }

    override fun apagar() {
        if (encendida) {
            encendida = false
            println("Lavadora apagada")
        }
    }
}
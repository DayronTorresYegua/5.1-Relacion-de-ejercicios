package org.example.dispositivosElectronicos

class Telefono: DispositivoElectronico, EncendidoApagado {

    private var encendido = false

    override fun encender() {
        if (!encendido) {
            encendido = true
            println("Teléfono encendido")
        } else {
            println("El teléfono ya está encendido")
        }
    }

    override fun apagar() {
        if (encendido) {
            encendido = false
            println("Teléfono apagado")
        }
    }

    override fun reiniciar() {
        if (encendido) {
            println("Reiniciando telefono")
        } else {
            println("El teléfono está apagado")
        }
    }




}
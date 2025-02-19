package org.example.dispositivosElectronicos

fun main() {

    val movil = Telefono()
    movil.encender()
    movil.apagar()
    movil.reiniciar()

    val lavadora = Lavadora()
    lavadora.encender()
    lavadora.apagar()

    val coche = Coche()
    coche.acelerar(20)  // No debería acelerar porque está apagado
    coche.encender()
    coche.acelerar(50)
    coche.frenar(30)
    coche.frenar(50)  // Velocidad debería ser 0
    coche.apagar()

}
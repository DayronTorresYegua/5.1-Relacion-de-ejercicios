package org.example.dispositivosElectronicos

interface Vehiculo {
    val motorEncendido: Boolean
    val kmHora: Int

    fun frenar(disminucion: Int)

    fun acelerar(aumento: Int)

}
package org.example.biblioteca

class Visitante(id: String, nombre: String): Usuario(id, nombre) {

    override fun tomarLibroPrestado(libro: Libro): String {
        return "El usuario $nombre es Visitante. No puedes tomar prestado ningún libro."
    }
}
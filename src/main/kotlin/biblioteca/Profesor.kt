package org.example.biblioteca

class Profesor(id: String, nombre: String, val departamento: String): Usuario(id, nombre) {

    override fun tomarLibroPrestado(libro: Libro): String {
        return "El usuario $nombre es Profesor. El profesor $nombre ha tomado prestado el libro ${libro.titulo} por 2 semanas."
    }
}
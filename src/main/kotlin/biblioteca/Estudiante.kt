package org.example.biblioteca

class Estudiante(id: String, nombre: String, val carrera: String): Usuario(id, nombre) {

    override fun tomarLibroPrestado(libro: Libro): String {
        return "El usuario $nombre es Estudiante. El estudiante $nombre ha tomado prestado el libro ${libro.titulo} por 1 semana."
    }
}
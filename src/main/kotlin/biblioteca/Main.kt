package org.example.biblioteca

fun main() {

    val usuario1 = Estudiante("1a2b", "Juan", "medicina")
    val usuario2 = Profesor("z0x9", "Gabri", "informatica")
    val usuario3 = Visitante("3c4d", "Pedro")

    val libro1 = Libro("El principito", "Antoine de Saint-Exupéry", 1943)
    val libro2 = Libro("El señor de los anillos", "J.R.R. Tolkien", 1954)

    println(usuario1.tomarLibroPrestado(libro1))
    println(usuario2.tomarLibroPrestado(libro2))
    println(usuario3.tomarLibroPrestado(libro1))
}

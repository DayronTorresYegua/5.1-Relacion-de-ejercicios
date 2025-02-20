package org.example.biblioteca

sealed class Usuario(val id: String, val nombre: String) {

    abstract fun tomarLibroPrestado(libro: Libro): String

}
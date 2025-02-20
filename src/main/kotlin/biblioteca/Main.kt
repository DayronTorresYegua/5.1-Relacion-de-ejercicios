package org.example.biblioteca

fun main() {

    val usuario1 = Estudiante("1a2b", "Juan", "medicina")
    val usuario2 = Profesor("z0x9", "Gabri", "informatica")
    val usuario3 = Visitante("3c4d", "Pedro")

    val libro1 = Libro("El principito", "Antoine de Saint-Exupéry", 1943)
    val libro2 = Libro("El señor de los anillos", "J.R.R. Tolkien", 1954)

    fun tomarLibroPrestado(usuario: Usuario, libro: Libro) {
        // Imprimir el tipo de usuario
        val tipoUsuario = when (usuario) {
            is Estudiante -> "Estudiante"
            is Profesor -> "Profesor"
            is Visitante -> "Visitante"
        }

        // Ahora se imprime el mensaje completo
        when (usuario) {
            is Estudiante -> println("El usuario ${usuario.nombre} es $tipoUsuario. \n" +
                    "El estudiante ${usuario.nombre} ha tomado prestado el libro ${libro.titulo} por 1 semana")
            is Profesor -> println("El usuario ${usuario.nombre} es $tipoUsuario. \n" +
                    "El profesor ${usuario.nombre} ha tomado prestado el libro ${libro.titulo} por 2 semanas")
            is Visitante -> println("El usuario ${usuario.nombre} es $tipoUsuario. \n" +
                    "No puedes tomar prestado ningún libro")
        }
    }

    tomarLibroPrestado(usuario1, libro1)
    tomarLibroPrestado(usuario2, libro2)
    tomarLibroPrestado(usuario3, libro1)
}

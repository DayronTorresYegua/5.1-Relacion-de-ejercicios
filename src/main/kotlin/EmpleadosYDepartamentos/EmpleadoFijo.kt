package org.example.EmpleadosYDepartamentos

class EmpleadoFijo(nombre: String, id: Int, private val salarioFijo: Double, private val numPagas: Int): Empleado(nombre, id) {

    init {
        require(salarioFijo > 0) { "El salario fijo debe ser mayor que 0" }
        require(numPagas > 0) { "El número de pagas debe ser mayor que 0" }
    }

    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }
}
package org.example.EmpleadosYDepartamentos

abstract class Empleado(val nombre: String, val id: Int) {

    abstract fun calculaSalario(): Double

    override fun toString(): String {
        return "$nombre con ID-${String.format("%04d", id)} tiene un salario de ${"%.2f".format(calculaSalario())} al mes"
    }

}
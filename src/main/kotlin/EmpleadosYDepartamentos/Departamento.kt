package org.example.EmpleadosYDepartamentos

class Departamento {

    val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calcularSalarioTotal(): Double {
        return empleados.sumOf {it.calculaSalario()}
    }

}
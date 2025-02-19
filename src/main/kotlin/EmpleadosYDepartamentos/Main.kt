package org.example.EmpleadosYDepartamentos

fun main() {

    val empleado1 = EmpleadoFijo("Juan", 1,  1000.0, 12)
    val empleado2 = EmpleadoPorHora("Manuel", 32,  120.0, 10)

    val departamento = Departamento()
    departamento.agregarEmpleado(empleado1)
    departamento.agregarEmpleado(empleado2)

    for (empleado in departamento.empleados) {
        println(empleado)
    }

}
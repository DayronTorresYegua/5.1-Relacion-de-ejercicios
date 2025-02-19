package org.example.EmpleadosYDepartamentos

class EmpleadoPorHora(nombre: String, id: Int, private val horasTrabajadasAlMes: Double, private val tarifaPorHora: Int): Empleado(nombre, id) {

    init {
        require(horasTrabajadasAlMes > 0) { "Las horas trabajadas al mes deben ser mayores que 0" }
        require(tarifaPorHora > 0) { "La tarifa por hora debe ser mayor que 0" }
    }

    override fun calculaSalario(): Double {
        return horasTrabajadasAlMes * tarifaPorHora
    }

}
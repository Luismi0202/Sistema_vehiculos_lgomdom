open class Vehiculo(
    private val marca: String,
    private val modelo: String,
    internal val capacidadCombustible: Int
) {
    init{
        id++
    }

    fun mostrarInformacion(){
        println("Vehículo $id-> Marca: $marca Modelo: $modelo Capacidad: ${capacidadCombustible}L Autonomia: ${calcularAutonomia()}KM en total")
    }

    open fun calcularAutonomia(): Int{
        return capacidadCombustible * 10
    }

    override fun toString(): String {
        return "Vehículo $id-> Marca: $marca Modelo: $modelo Capacidad: $capacidadCombustible"
    }

    companion object{
        var id = 0
    }
}
class Motocicleta(
    marca: String,
    modelo: String,
    capacidadCombustible: Int,
    var propiedad: Int
):Vehiculo(marca,modelo, capacidadCombustible) {
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}
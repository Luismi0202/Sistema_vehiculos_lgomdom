

fun main(){
    var vehi = Vehiculo("Toyota","39443",40)
    var auto = Automovil("Toyota","34343",40,"sedán")
    var moto = Motocicleta("MOTOROLA","fksdks",40,30)

    vehi.mostrarInformacion()
    auto.mostrarInformacion()
    moto.mostrarInformacion()

    println(auto.propiedad)
    println(moto.propiedad)
}
fun main () {
    var cars = arrayOf("Honda","Toyota","Mercedes")

    cars.forEach { car ->
        println("Ini adalah mobil $car")
    }

    val honda = cars.filter{ car -> car == "Honda" }
    println(honda)

    var nilaimahasiswa= arrayOf(30,70,90,85,64,65)
    val lulusMatkulProgramming = nilaimahasiswa.filter { nilai -> nilai >= 65 }
    println(lulusMatkulProgramming)
}
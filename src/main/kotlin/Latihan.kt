fun main() {
        var lamaParkir: Int
        var totalParkir: Double



        // rule biaya parkir
        val tarifDasar = 1.0
        val tarifBerikutnya = 0.5
        val maxTarifPerHari = 15

<<<<<<< HEAD
        lamaParkir = 26
=======
        lamaParkir = 24
>>>>>>> bf79a0dd7c66b48b739b768ed24811246c9c2075
        if (lamaParkir<=5){
            totalParkir= tarifDasar*lamaParkir
        } else if(lamaParkir>5 && lamaParkir<24){
            totalParkir= 5+((lamaParkir-5)* 0.5)
        } else {
            totalParkir=(15 * (lamaParkir/24)) + (0.5*(lamaParkir%24))
        }


    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $totalParkir")
}
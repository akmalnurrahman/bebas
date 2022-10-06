fun hellopolban() {
    println("Hello Polban")
}
fun helloSiswa(nama:String){
    println("hallo apa kabar $nama")
}
fun nilaiAkhir(uts:Double, uas:Double): Double{
    return (uts+uas)/ 2
}
fun main (){
    val nama = "Masprams"
    hellopolban()
    helloSiswa(nama)
    val nilai = nilaiAkhir( 8.0, 7.0)
    println("Nilai akhir $nama adalah $nilai")
}
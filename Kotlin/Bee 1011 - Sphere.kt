fun main(){

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val volume = (4.0/3) * pi * (raio * raio * raio)
    println("VOLUME = %.3f".format(volume))

}
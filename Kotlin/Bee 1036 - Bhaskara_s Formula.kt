import kotlin.math.pow

fun main() {

    val values = readLine()
    val list = values!!.split(" ")
    val a = list[0].toDouble()
    val b = list[1].toDouble()
    val c = list[2].toDouble()
    val delta = (b * b) - (4 * a * c)

    if(a == 0.0 || delta < 0){
        println("Impossivel calcular")
    }else{
        val r1 = (-b + delta.pow(0.5)) / (2 * a)
        val r2 = (-b - delta.pow(0.5)) / (2 * a)
        println("R1 = %.5f".format(r1))
        println("R2 = %.5f".format(r2))

    }
}


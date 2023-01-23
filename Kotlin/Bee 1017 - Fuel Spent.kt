fun main(){

    val time = readLine()!!.toDouble()
    val speed = readLine()!!.toDouble()
    val distance = time * speed
    val fuel = distance / 12
    println("%.3f".format(fuel))

}
fun main(){

    val distance = readLine()!!.toInt()
    val fuel = readLine()!!.toDouble()
    val consumption = distance / fuel
    println("%.3f km/l".format(consumption))

}
import kotlin.math.abs

fun biggest(number1: Int, number2: Int): Int{
    return (number1 + number2 + abs(number1-number2))/2
fun main(args: Array<String>) {

    val values = readLine()
    val listvalues = values!!.split(" ")
    val a = listvalues[0].toInt()
    val b = listvalues[1].toInt()
    val c = listvalues[2].toInt()

    val big = biggest(a, b)

    if (big > c){
        println("$big eh o maior")
    }else{
        println("$c eh o maior")
        }

}
}
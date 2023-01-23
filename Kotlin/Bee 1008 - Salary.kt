fun main(){

    val number = readLine()!!.toInt()
    val hours = readLine()!!.toInt()
    val amount = readLine()!!.toDouble()
    val salary = hours * amount
    println("NUMBER = $number")
    println("SALARY = U$ %.2f".format(salary))

}
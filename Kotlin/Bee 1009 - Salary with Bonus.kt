fun main(){

    val nome = readLine()!!.toString()
    val salary = readLine()!!.toDouble()
    val sold = readLine()!!.toDouble()
    val percentage = sold * 0.15
    val total = (salary + percentage)
    println("TOTAL = R$ %.2f".format(total))

}
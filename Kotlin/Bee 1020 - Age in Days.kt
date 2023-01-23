fun main(){

    val ageinday = readLine()!!.toInt()
    val years = ageinday / 365
    val months = (ageinday - (years * 365)) / 30
    val days = (ageinday - (years * 365)) - (months * 30)
    println("$years ano(s)")
    println("$months mes(es)")
    println("$days dia(s)")

}
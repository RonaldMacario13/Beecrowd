fun main(){

    val seconds = readLine()!!.toInt()

        val hours = seconds / 3600
        val resthours =seconds % 3600
        val min = resthours / 60
        val restmin = resthours % 60
        val seconds2 = restmin % 60
        println("$hours:$min:$seconds2")

}
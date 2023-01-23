fun main() {

    val code = readLine()!!.toInt()
    val list = when (code) {

        61 -> "Brasilia"
        71 -> "Salvador"
        11 -> "Sao Paulo"
        21 -> "Rio de Janeiro"
        32 -> "Juiz de Fora"
        19 -> "Campinas"
        27 -> "Vitoria"
        31 -> "Belo Horizonte"
        else -> "DDD nao cadastrado"
    }
    println(list)
}

/*if (code == 61){
     println("Brasilia")
 }else if (code == 71){
     println("Salvador")
 }else if (code == 11){
     println("Sao Paulo")
 }else if (code == 21){
     println("Rio de Janeiro")
 }else if (code == 32){
     println("Juiz de Fora")
 }else if (code == 19){
     println("Campinas")
 }else if (code == 27){
     println("Vitoria")
 }else if (code == 31){
     println("Belo Horizonte")
 }else{
     println("DDD nao cadastrado")
 }
}

  */
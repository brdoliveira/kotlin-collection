package br.com.alura.teste

fun testeComparaValoresLoop(){
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    for(idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println("A maior idade é $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade){
            menorIdade = idade
        }
    }
    println("A menor idade é $menorIdade")

}
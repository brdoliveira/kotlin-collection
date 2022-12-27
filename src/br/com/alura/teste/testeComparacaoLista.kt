package br.com.alura.teste

fun testeComparacaoLista(){
    val idades: IntArray = intArrayOf(10,12,18,33,40,67)

    val maiorIdade: Int? = idades.max()
    println("Maior idade $maiorIdade")

    val menorIdade: Int? = idades.min()
    println("Menor idade $menorIdade")

    val mediaIdade: Double = idades.average()
    println("Média: $mediaIdade")

    val todosMaiores = idades.all { it > 18 }
    println("Todos são maiores de idade? $todosMaiores")

    val existeMaiorIdade = idades.any{ it >= 18}
    println("Algum aluno é maior de idade? $existeMaiorIdade")

    val maioresIdade = idades.filter { it >= 18 }
    println("Maiores: $maioresIdade")

    val idade18 = idades.find { it >= 18 }
    println("Busca: $idade18")
}
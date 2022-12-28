package br.com.alura.teste

fun testeAumentosSalarios(){
    val salarios1: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val salarios2: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    for (indice in salarios1.indices){
        salarios1[indice] = salarios1[indice] * aumento
    }
    println(salarios1.contentToString())

    salarios2.forEachIndexed { index, salario ->
        salarios2[index] = salario * aumento
    }
    println(salarios2.contentToString())
}
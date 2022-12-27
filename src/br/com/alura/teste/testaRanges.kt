package br.com.alura.teste

fun testaRanges(){
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        println("$s")
    }
    println()

    val numerosPares: IntProgression = 2.until(100) step 2
    for(par in numerosPares){
        print("$par")
    }
    println()

    val numerosParesReverso =  100 downTo 0 step 2
    numerosParesReverso.forEach{ println("$it")}
    println()

    val intervalo = 1500..5000
    val salario1 = 4500
    if(salario1 in intervalo){
        println("salario1 está dentro do intervalo")
    }else{
        println("salario1 não está dentro do intervalo")
    }

    val salario2 = 4500
    if(salario2 in intervalo){
        println("salario2 está dentro do intervalo")
    }else{
        println("salario2 não está dentro do intervalo")
    }

    val alfabeto = 'a' .. 'z'
    val letra = 'k'
    val letraMaiuscula = 'A'

    println("Letra $letra está no alfabeto: ${letra in alfabeto}")
    println("Letra $letraMaiuscula está no alfabeto: ${letraMaiuscula in alfabeto}")
}
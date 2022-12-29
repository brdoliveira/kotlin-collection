package br.com.alura.teste.collections

import br.com.alura.modelo.BancoDeNomes

fun testaCopia(){
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    // banco.nomes.add("Alex"
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}
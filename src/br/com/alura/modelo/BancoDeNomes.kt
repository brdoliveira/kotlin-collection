package br.com.alura.modelo

class BancoDeNomes(){
    private val dados = mutableListOf<String>()
    val nomes : Collection<String> get() = dados.toList() // .toList() nesse caso evita o cast

    fun salva(nome:String){
        dados.add(nome)
    }

    companion object{
        private val dados = mutableListOf<String>()
    }
}
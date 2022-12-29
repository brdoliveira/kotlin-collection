package br.com.alura.teste.collections

fun testaComportamentosMap(){
    val pedidos = mutableMapOf<Int,Double>(
        Pair(1,20.0),
        Pair(2,34.0),
        3 to 50.0, // perca de performance
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )
    val valorPedido = pedidos.getValue(3)
    println(valorPedido)

    val mensagem: Double = pedidos.getOrElse(6,{
        0.0
    })
    println(mensagem)

    println(pedidos.getOrDefault(7, -1.0))

    println(pedidos.keys)
    for (valor in pedidos.values){
        println("Pedido $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero,valor) ->
        numero % 2 == 0 && valor > 70.00
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6,5))
    println(pedidos)

    //pedidos.putAll(listOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}
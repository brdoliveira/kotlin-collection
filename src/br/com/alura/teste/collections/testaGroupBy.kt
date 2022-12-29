package br.com.alura.teste.collections

import br.com.alura.modelo.Pedido

fun testaGroupBy(){
    val pedidos = listOf(
        Pedido(1,20.0),
        Pedido(2,60.0),
        Pedido(3,30.0),
        Pedido(4,70.0)
    )
    println(pedidos)

    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1,20.0)])

//    val mapa: Map<Boolean,Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedidos ->
            pedidos.valor > 50.0
        }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])
}
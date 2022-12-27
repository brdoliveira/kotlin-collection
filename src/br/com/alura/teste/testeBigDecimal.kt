package br.com.alura.teste

import br.com.alura.utils.*
import java.math.BigDecimal
import java.math.RoundingMode

fun testeBigDecimal() {
    val salarios1 = Array<BigDecimal>(5){ BigDecimal.ZERO}
    salarios1[0] = "1500.55".toBigDecimal()
    salarios1[1] = "2000.00".toBigDecimal()
    println(salarios1.contentToString())

    val salarios2 = bigDecimalArrayOf("1500.55","2000.00","10000.00")
    println(salarios2.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario -> calculaAumentoRelativo(salario,aumento)
        }.toTypedArray()
    println(salariosComAumento)

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial com os salários: $gastoInicial")

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial){ acumulador, salario ->
        acumulador + (salario * meses).setScale(2,RoundingMode.UP)
    }
    println("Gasto total com os salários: $gastoTotal")

    val mediaMaiores = salariosComAumento
                .sorted()
                .takeLast(3)
                .toTypedArray()
                .media()
    println("Media maiores: $mediaMaiores")

    val mediaMenores = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Media menores: $mediaMenores")
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal{
    return if(salario < "5000".toBigDecimal()) salario + "500".toBigDecimal()
    else (salario * aumento).setScale(2,RoundingMode.UP)
}
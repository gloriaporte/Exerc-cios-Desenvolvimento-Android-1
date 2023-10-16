package basico

import java.lang.RuntimeException

fun main() {
    var entrada: String? = null

    println("Digite uma entrada: ")
    entrada = leiaEntrada()

    if(entrada != null) {
        println("Foram lidos ${entrada.length} caracteres")
    }

    println("Foram lidos ${entrada?.length} caracteres")
    println("Foram lidos ${entrada!!.length} caracteres")

}

fun leiaEntrada(): String? {
    return try {
        val entrada = readln()
        entrada
    } catch (rte: RuntimeException) {
        null
    }
}
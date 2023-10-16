package basico

fun main() {
    //nOS CONJUNTOS NÃO TEM REPETIÇÃO DE VALOR
    val setPaises: MutableSet<String> = mutableSetOf("BRASIL", "ARGENTINA", "URUGUAI")
    do {
        println("Entre com o nome de um país: ")
        val pais: String? = readLine()
        if (!pais.isNullOrEmpty()) {
            setPaises.add(pais.uppercase())
        }
    } while (!pais.isNullOrEmpty())

    println("Países inseridos")
    setPaises.forEach {
        println("País: $it")
    }
}
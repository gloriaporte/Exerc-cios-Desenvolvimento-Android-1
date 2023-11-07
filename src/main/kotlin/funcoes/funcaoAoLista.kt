package funcoes

fun inverte(s: String) = s.reversed()

fun List<String>.aplica(processa: (String) -> String): List<String> {
    val listaProcessada: MutableList<String> = mutableListOf()
    for (item in this) {
        listaProcessada.add(processa(item))
    }
    return listaProcessada
}

fun main() {
//    println(inverte("Pedro"))

    val listaNomes = listOf("ana", "naria", "luiza", "fernanda")
    listaNomes.aplica(::inverte).forEach(::println)
    listaNomes.aplica(::inverte).forEach{nomeProcessado: String -> println(nomeProcessado)}
//    listaNomes.aplica{ capitaliza(it) }.forEach{ println(it) }
}
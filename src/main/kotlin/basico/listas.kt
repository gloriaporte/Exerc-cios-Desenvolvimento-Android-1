package basico

fun main() {
    //Lists são IMUTÁVEIS
    val tbbt: List<String> = listOf("Sheldon", "Leonard", "Raj", "Howard", "Penny")
    for (personagem: String in tbbt) {
        println("The Big Bang Theory: $personagem")
    }

    //MUTABLELIST SÃO MUTÁVEIS
    val taahm: MutableList<String> = mutableListOf("Charlie", "Alan", "Jake", "Bertha")
    taahm.add("Walden")
    for (i in 0 .. 4) {
        println("Two and a Half Men: ${taahm[i]}")
    }

    val listaInteiros: List<Int> = (0 .. 10).toList()
    listaInteiros.forEach {
        println(it)
    }

    val listaPares: List<Int> = (0 .. 10 step 2).toList()
    listaPares.forEach {
        println(it)
    }
}


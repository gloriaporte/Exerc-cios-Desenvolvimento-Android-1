package listaexercicios

fun main() {
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca")
    )

    for((index, valor) in familiaMap) {
        println("$index: $valor")
    }
}
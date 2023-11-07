package funcoes

fun incrementa(i: Int) = i + 1

inline fun <T> List<T>.aplica(processa: (T) -> T): List<T> = this.map{processa(it)}
inline fun <T, S> List<T>.transforma(processa: (T) -> S): List<S> {
    val listaTransformada: MutableList<S> = mutableListOf()
    for(item in this) {
        listaTransformada.add(processa(item))
    }
    return listaTransformada
}

fun main() {
    val listaInteiros = (0..10).toList()
    println("Valores incrementados")
    listaInteiros.aplica { incrementa(it) }.forEach { println(it) }

    val listaNomes = listOf("ana", "naria", "luiza", "fernanda")
    println("Quantiddade de letras nos nomes")
    listaNomes.transforma { it.count() }.forEach { println(it) }
}
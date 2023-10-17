package listaexercicios

fun main() {
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    //Nova lista de cursos
    val cursosSistemas = listaCursos.filter { it.contains("Sistemas", ignoreCase = true) }
    for (curso in cursosSistemas) println(curso)
}
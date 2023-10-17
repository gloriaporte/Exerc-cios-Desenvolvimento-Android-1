package listaexercicios

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun somar(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
// Main
fun main() {
// 1. Chamadas do primeiro passo
    val resultado1 = processaInteiro(5) { it -> soma(it, 2) }
    val resultado2 = processaInteiros(6,3, ::multiplica)
    val resultado3 = processaInteiro(25, ::raizQuadrada)

    println("Chamadas do primeiro passo:")
    println("Resultado 1: $resultado1")
    println("Resultado 2: $resultado2")
    println("Resultado 3: $resultado3")


// 2. Chamadas do segundo passo
    val resultado4 = processaInteiro(8) { it * it }
    val resultado5 = processaInteiros(4,7) {  a, b -> a + b }
    val resultado6 = processaInteiro(10) { it * 3 }

    println("Chamadas do segundo passo:")
    println("Resultado 4: $resultado4")
    println("Resultado 5: $resultado5")
    println("Resultado 6: $resultado6")
}
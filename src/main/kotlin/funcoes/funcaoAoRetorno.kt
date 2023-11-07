package funcoes

enum class OperacaoAritmetica { ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO }

fun divisao(a: Int, b: Int) = a / b

inline fun Int.calcula(a: Int, funcao: (Int, Int) -> Int) = funcao(this, a)

fun retornaOperacao(operacao: OperacaoAritmetica): (Int, Int) -> Int {
    val subtracao: (Int, Int) -> Int = {a, b -> a - b}

    return when (operacao) {
        OperacaoAritmetica.ADICAO -> {x, y -> x + y}
        OperacaoAritmetica.SUBTRACAO -> subtracao
        OperacaoAritmetica.MULTIPLICACAO -> fun (a, b): Int { return a * b }
        OperacaoAritmetica.DIVISAO -> ::divisao
    }
}

fun main() {
    println(10.calcula(5, retornaOperacao(OperacaoAritmetica.ADICAO)))
    println(10.calcula(5, retornaOperacao(OperacaoAritmetica.SUBTRACAO)))
    println(10.calcula(5, retornaOperacao(OperacaoAritmetica.MULTIPLICACAO)))
    println(10.calcula(5, retornaOperacao(OperacaoAritmetica.DIVISAO)))

}
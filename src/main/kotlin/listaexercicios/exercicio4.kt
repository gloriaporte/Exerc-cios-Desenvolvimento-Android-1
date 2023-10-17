package listaexercicios

fun <T, R> xpto(a: T, b: T, operation: (T,T) -> R): R = operation(a,b)
fun main() {
    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}
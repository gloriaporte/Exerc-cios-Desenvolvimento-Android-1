package listaexercicios

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

//Função nova foo e a bar
fun foo(a: Int, b: Int, operation: (Int, Int) -> Int): Int =  operation(a,b)

fun bar(s1: String, s2: String, operation: (String, String) -> String): String =  operation(s1,s2)

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}
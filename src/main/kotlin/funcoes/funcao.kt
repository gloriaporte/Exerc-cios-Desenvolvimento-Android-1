package funcoes

fun multiplo(a: Int, b: Int): Boolean = a % b == 0
fun Int.multiploo(b: Int) = multiplo(this, b)
infix fun Int.multiplooo(b: Int) = this.multiploo(b)
fun restoA(a: Int = 10, b: Int) = a % b
fun restoB(a: Int, b: Int = 2) = restoA(a, b)

fun main() {
    println(multiplo(10,2))
    println(10.multiploo(2))
    println(10.multiplooo(3))
    println(10 multiplooo(3))
    println(10 multiplooo 3)

    //Evitar que os parâmetros sejam preenchidos do primeiro pro último
    println(restoA(b = 2))
    println(restoB(10))
}
package funcoes

fun multiplo(a: Int, b: Int): Boolean = a % b == 0
fun Int.multiploo(b: Int) = multiplo(this, b)
infix fun Int.multiplooo(b: Int) = this.multiploo(b)
fun main() {
    println(multiplo(10,2))
    println(10.multiploo(2))
    println(10.multiplooo(3))
    println(10 multiplooo(3))
    println(10 multiplooo 3)
}
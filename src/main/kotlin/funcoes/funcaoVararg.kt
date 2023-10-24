package funcoes

fun media(vararg valores: Double): Double {
   var media = 0.0
   for (valor in valores) {
       media += valor / valores.size
   }
    return media
}
fun main() {
    println(media(1.1,2.2,3.3,4.4,5.5))

    //* para espalhar
    val listaValores = listOf(0.0, 1.0, 2.0, 3.0, 4.0, 5.0)
    println(media(*listaValores.toDoubleArray()))
}
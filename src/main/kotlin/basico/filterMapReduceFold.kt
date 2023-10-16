package basico

enum class SO { ANDROID, IOS, OUTRO }
data class Smartphone(
    val fabricante: String,
    val so: SO,
    val valor: Float,
    val quantidade: Int
)
fun main() {
    val smartphonesDisponiveis: List<Smartphone> = listOf(
        Smartphone("Samsung", SO.ANDROID, 2000F, 10),
        Smartphone("Motorola", SO.ANDROID, 1500f, 5),
        Smartphone("Iphone", SO.IOS, 5000f, 20),
        Smartphone("Xiaomi", SO.ANDROID, 1800f, 4),
        Smartphone("Huawei", SO.OUTRO, 2500f, 8),
        Smartphone("Realme", SO.ANDROID, 2100f, 3),
    )

    println("Smartphones com Android")
    smartphonesDisponiveis.filter { it.so == SO.ANDROID }.forEach { println(it) }

    println("Sistemas operacionais")
    smartphonesDisponiveis.map { it.so }.forEach { println(it) }

    val totalEstoque = smartphonesDisponiveis.map { it.valor * it.quantidade}.reduce {
        total, valorQtde -> total + valorQtde
    }
    println("Valor do estoque: $totalEstoque")

    val totalEstoqueAndroid = smartphonesDisponiveis.filter { it.so == SO.ANDROID }.map{ it.valor * it.quantidade }
        .fold(0f) { total, valorQtde ->
            total + valorQtde
    }
    println("Valor do  android: $totalEstoqueAndroid")

}
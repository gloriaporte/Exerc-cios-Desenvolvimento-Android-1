package basico

import kotlin.random.Random

fun main() {
    var nome: String = "Glória"
    nome = "Glória"
    println(nome)

    val cpf = "123456789-10"
    println("Quando já criamos uma variável imutável com um valor atribuído, como a linguagem é fortemente tipada, String por exemplo já fica nesse tipo.")

    val sobrenome: String
    sobrenome = "Porte"
    println("O nome completo é: $nome $sobrenome")
    println("Meu sobrenome tem ${sobrenome.length} letras")
    println("Meu sobrenome tem ${sobrenome.count()} letras")

    val altura: Float = 1.70f
    val diaNascimento = 25
    val mesNascimento: String = "Julho"
    val peso: String = 72.toLong().toFloat().toDouble().toString()
    println(peso);

    val indefinido: Any = retornaUmTipoAleatorio()
    val inteiro: Int? = indefinido as? Int
    val double: Double? = indefinido as? Double
    val string: String? = indefinido as? String
    val float: Float? = indefinido as? Float
    val boolean: Boolean? = indefinido as? Boolean

    println("Inteiro: $inteiro \nFloat: $float \nDouble: $double \nString $string \nBoolean: $boolean")

    if(indefinido is Int) {
        indefinido
    }

}

fun retornaUmTipoAleatorio(): Any {
    val numeroSorteado = Random(System.currentTimeMillis()).nextInt(6)
    return when (numeroSorteado) {
        0 -> numeroSorteado //Inteiro
        1 -> numeroSorteado.toFloat()
        2 -> numeroSorteado.toDouble()
        3 -> numeroSorteado.toString()
        4 -> true
        5 -> false
        else -> Any()
    }
}
package funcoes

fun concatenar(r: String, s: String): String = "$r$s"
fun capitalizar(r: String): String = r.replaceFirstChar { r.first().uppercase() }
fun capitalizaConcatena(r: String, s: String) = concatenar(capitalizar(r), capitalizar(s))

fun processaTexto(t1: String, t2: String, processa: (String, String) -> String): String {
    return processa(t1, t2)
}
fun main() {
    val nome = "glória"
    val sobrenome = "porte"

    println(concatenar(nome, sobrenome))
    println(capitalizar(nome))
    println(capitalizar(sobrenome))
    println(capitalizaConcatena(nome, sobrenome))

    //Chamar uma função como parâmetro
    println(processaTexto(nome, sobrenome, ::concatenar))
    println(processaTexto(nome, sobrenome, { a, b -> ""  }))
    println(processaTexto(nome, sobrenome, { a: String, b: String -> "$b$a"  }))
    println(processaTexto(nome, sobrenome) { a, b -> "${b.uppercase()}$a"  })
}
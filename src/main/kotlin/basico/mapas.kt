package basico


enum class Estilo { PILSEN, PALE_ALE, IPA, NEIPA, APA, RIS }
fun main() {
    val mapCerverjas: MutableMap<Estilo, String> = mutableMapOf(
        Pair(Estilo.PILSEN, "Urquell"),
        Pair(Estilo.PALE_ALE, "Dead Pony"),
        Pair(Estilo.IPA, "Fuller's India Pale Le")
    )

    mapCerverjas.put(Estilo.NEIPA, "Everkings")
    mapCerverjas[Estilo.APA] = "Sierra Nevada Pale Ale"
    mapCerverjas[Estilo.RIS] = "Dum Petroleum"

    mapCerverjas.forEach {
         estilo, cerveja -> println("Uma boa $estilo é $cerveja")
    }

    mapCerverjas.keys.forEach {
        println("Estilo: $it")
    }

    mapCerverjas.values.forEach {
        println("Cerveja: $it")
    }

}
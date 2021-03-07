fun main(args: Array<String>) {

    val lista = mutableListOf<Pessoa>()

    val pessoa = Pessoa(nome = "null", email = "joaopedro_moraes9@outlook.com", idade = 23)
    val pessoa1 = Pessoa(nome = "Andressa Cristina", email = "joaopedro_moraes9@outlook.com", idade = 23)
    val pessoa2 = Pessoa(nome = "Isaias", email = "joaopedro_moraes9@outlook.com", idade = 23)
    val pessoa3 = Pessoa(nome = "Jucimara Moraes Santos", email = "joaopedro_moraes9@outlook.com", idade = 23)
    val pessoa4 = Pessoa(nome = "Mariana Moraes", email = "joaopedro_moraes9@outlook.com", idade = 23)

    lista.addAll(listOf(pessoa, pessoa1, pessoa2, pessoa3, pessoa4))

//    lista.forEach { println(it) }
//
//    lista.filter { it.nome!!.startsWith("J") }
//            .map { println(it.nome!!.plus("Vrau")) }

//    lista.removeIf { it.nome!!.endsWith("s") }
//    lista.removeAll { it.nome!!.endsWith("s") }
//    lista.removeFirst()
//    lista.removeFirstOrNull()

    lista.sortBy { it.nome }
    lista.sortByDescending { it.nome }

    lista.sumBy { it.idade!! }.also { println(it) }

    println(!lista.contains(pessoa))

    println(lista)
}

data class Pessoa(
        var nome: String? = null,
        var email: String? = null,
        var idade: Int? = null
)
fun main(args: Array<String>) {

    val nota = 4

    when (nota) {
        in 1..4 -> println("Reprovado")
        in 5..7 -> println("Recuperação")
        in 8..10 -> println("Aprovado!!!")
        else -> println("Nenhuma das condições foram satisfeitas")
    }
}
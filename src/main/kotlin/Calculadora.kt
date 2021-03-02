fun main(args: Array<String>) {

    println("Calculadora v1.0\n\n")
    println("Escolha a operação: (1) Soma, (2) Subtração, (3) Multiplicação e (4) para Divisão")

    val operacao = readLine()?.toInt()

    when (operacao) {
        1 -> {
            val x = readLine()?.toInt()
            val y = readLine()?.toInt()
            println("Resultado: ${x!! + y!!}")
        }
        2 -> {
            val x = readLine()?.toInt()
            val y = readLine()?.toInt()
            println("Resultado: ${x!! - y!!}")
        }
        3 -> {
            val x = readLine()?.toInt()
            val y = readLine()?.toInt()
            println("Resultado: ${x!! * y!!}")
        }
        3 -> {
            val x = readLine()?.toInt()
            val y = readLine()?.toInt()
            println("Resultado: ${x!! / y!!}")
        }
        else -> println("Operação não existente!")
    }
}
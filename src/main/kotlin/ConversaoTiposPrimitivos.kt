fun main(args: Array<String>) {
    println("###### Conversão Tipos Primitivos ######")

    val char = 'M' // Char
    val int = 1230 // Int
    val float = 100F // Float
    val string = "String" // String
    val double = 143.10 // Double
    val long = 12_900_00000000000000L

    println("###### CHAR ######")

    val charToFloat = char.toFloat()
    val charToDouble = char.toDouble()
    val charToInt = char.toInt()
    val charShort = char.toShort()
    val charToByte = char.toByte()
    val charToLong = char.toLong()

    println("charToFloat: $charToFloat")
    println("charToDouble: $charToDouble")
    println("charToInt: $charToInt")
    println("charShort: $charShort")
    println("charToByte: $charToByte")
    println("charToLong: $charToLong")

    println("###### FLOAT ######")

    val intToFloat = int.toFloat()
    val intToDouble = int.toDouble()
    val intToChar = int.toChar()
    val intToShort = int.toShort()
    val intToByte = int.toByte()
    val intToLong = int.toLong()

    println("intToFloat: $intToFloat")
    println("intToDouble: $intToDouble")
    println("intToChar: $intToChar")
    println("intToShort: $intToShort")
    println("intToByte: $intToByte")
    println("intToLong: $intToLong")

    System.err.println("OBS: OS OUTROS TIPOS TAMBÉM POSSUEM OS MÉTODOS PARA CONVERSÃO!!")
}
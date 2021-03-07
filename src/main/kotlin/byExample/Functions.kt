package byExample

// Default Parameter Values and Named Arguments

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

//Infix Functions
class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

// Operator Functions
operator fun Int.times(str: String) = str.repeat(this)

operator fun String.get(range: IntRange) = substring(range)

// Functions with vararg Parameters
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun main() {

    // Default Parameter Values and Named Arguments
    println("#### Default Parameter Values and Named Arguments ####")
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))

    // Infix Functions
    println("#### Infix Functions ####")
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

    // Operator Functions
    println("#### Operator Functions ####")
    println(2 * "Bye ")
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    // Functions with vararg Parameters
    println("#### Functions with vararg Parameters ####")
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
}
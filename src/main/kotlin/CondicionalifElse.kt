import java.util.*

fun main(args: Array<String>) {

    val x = 55

    if (x % 2 == 0) {
        println("É par!")
    } else {
        println("É impar!")
    }

    val list = listOf("Palmeiras", "São Paulo", "Corinthians")

    val random = Random().nextInt(3)

    if (random == 0) {
        println("É VERDÃO!!!!!")
    } else if (random == 1) {
        println("É BAMBII!!")
    } else {
        println("É MANO!!")
    }

}
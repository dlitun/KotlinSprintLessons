package lesson6

const val ONE_SECOND_MS = 1000L

fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()

    var remainingSeconds = seconds

    while (remainingSeconds > 0) {
        Thread.sleep(ONE_SECOND_MS)
        remainingSeconds--
    }

    println("Прошло $seconds секунд")
}
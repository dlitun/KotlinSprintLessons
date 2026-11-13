package lesson6

fun main() {
    print("Введите количество секунд: ")
    var counter = readln().toInt()

    do {
        println("Осталось секунд: $counter")

        if (counter > 0) {
            Thread.sleep(ONE_SECOND_MS)
            counter--
        }
    } while (counter > 0)

    println("Время вышло")
}
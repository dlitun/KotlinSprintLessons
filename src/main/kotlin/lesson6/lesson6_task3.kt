package lesson6

fun main() {
    print("Введите количество секунд: ")
    var counter = readln().toInt()

    do {
        println("Осталось секунд: $counter")
        Thread.sleep(1000)
        counter--
    } while (counter > 0)

    println("Время вышло")
}
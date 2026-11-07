package lesson5

fun main() {
    val firstNumber = 7
    val secondNumber = 5

    println("Докажите, что вы не бот! Решите пример:")
    println("$firstNumber + $secondNumber = ?")

    val userAnswer = readln().toIntOrNull()

    if (userAnswer == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
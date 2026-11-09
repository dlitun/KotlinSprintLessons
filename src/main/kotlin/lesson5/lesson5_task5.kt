package lesson5

fun main() {
    val winningNumbers = (0..42).shuffled().take(3)

    println("Угадайте три числа от 0 до 42!")

    print("Введите первое число: ")
    val firstUserNumber = readln().toInt()

    print("Введите второе число: ")
    val secondUserNumber = readln().toInt()

    print("Введите третье число: ")
    val thirdUserNumber = readln().toInt()

    val userNumbers = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)

    val matchedNumbers = winningNumbers.intersect(userNumbers)
    val matchedCount = matchedNumbers.size

    val resultText = when (matchedCount) {
        3 -> "Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!"
        2 -> "Отлично! Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число. Вам достаётся утешительный приз."
        else -> "Вы не угадали ни одного числа. Попробуйте снова!"
    }

    println(resultText)
    println("Выигрышные числа были: $winningNumbers")
}
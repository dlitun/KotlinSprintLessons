package lesson5

const val FIRST_WINNING_NUMBER = 17
const val SECOND_WINNING_NUMBER = 34

fun main() {
    println("Введите первое число от 0 до 42:")
    val firstUserNumber = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val secondUserNumber = readln().toInt()

    val guessedBoth =
        (firstUserNumber == FIRST_WINNING_NUMBER && secondUserNumber == SECOND_WINNING_NUMBER) ||
                (firstUserNumber == SECOND_WINNING_NUMBER && secondUserNumber == FIRST_WINNING_NUMBER)

    val guessedAtLeastOne =
        firstUserNumber == FIRST_WINNING_NUMBER ||
                firstUserNumber == SECOND_WINNING_NUMBER ||
                secondUserNumber == FIRST_WINNING_NUMBER ||
                secondUserNumber == SECOND_WINNING_NUMBER

    val result = if (guessedBoth) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if (guessedAtLeastOne) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }

    println(result)
    println("Правильные числа были: $FIRST_WINNING_NUMBER и $SECOND_WINNING_NUMBER")
}
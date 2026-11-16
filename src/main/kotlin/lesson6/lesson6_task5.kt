package lesson6

const val CAPTCHA_MIN = 1
const val CAPTCHA_MAX = 9
const val CAPTCHA_MAX_ATTEMPTS = 3

fun main() {
    var attemptsLeft = CAPTCHA_MAX_ATTEMPTS

    while (attemptsLeft > 0) {
        val firstNumber = (CAPTCHA_MIN..CAPTCHA_MAX).random()
        val secondNumber = (CAPTCHA_MIN..CAPTCHA_MAX).random()
        val correctAnswer = firstNumber + secondNumber

        print("Докажите, что вы не бот. Сложите: $firstNumber + $secondNumber = ")
        val userAnswer = readln().toIntOrNull()

        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            return
        }

        attemptsLeft--
        if (attemptsLeft > 0) {
            println("Неверно. Осталось попыток: $attemptsLeft")
        }
    }

    println("Доступ запрещен")
}
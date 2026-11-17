package lesson7

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    print("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH): ")
    val length = readln().toInt()

    if (length < MIN_PASSWORD_LENGTH) {
        println("Пароль должен быть не короче $MIN_PASSWORD_LENGTH символов")
        return
    }

    val digits = '0'..'9'
    val lowers = 'a'..'z'
    val uppers = 'A'..'Z'

    val allChars = digits + lowers + uppers

    val passwordChars = mutableListOf<Char>()
    passwordChars += digits.random()
    passwordChars += lowers.random()
    passwordChars += uppers.random()

    repeat(length - 3) {
        passwordChars += allChars.random()
    }

    passwordChars.shuffle()

    val password = passwordChars.joinToString("")

    println("Ваш пароль: $password")
}
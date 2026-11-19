package lesson10

fun main() {
    println("Регистрация в приложении")

    val login = getInput("Введите логин:")
    val password = getInput("Введите пароль:")

    if (validateInput(login) && validateInput(password)) {
        println("Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun getInput(message: String): String {
    println(message)
    return readln()
}

fun validateInput(input: String): Boolean {
    return input.length >= 4
}
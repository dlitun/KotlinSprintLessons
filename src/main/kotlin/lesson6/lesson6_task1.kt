package lesson6

fun main() {
    println("Регистрация")

    print("Придумайте логин: ")
    val registeredLogin = readln()

    print("Придумайте пароль: ")
    val registeredPassword = readln()

    println("Авторизация")

    do {
        print("Введите логин: ")
        val login = readln()

        print("Введите пароль: ")
        val password = readln()

        val isAuthorized = login == registeredLogin && password == registeredPassword

        if (isAuthorized) {
            println("Авторизация прошла успешно")
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    } while (!isAuthorized)
}
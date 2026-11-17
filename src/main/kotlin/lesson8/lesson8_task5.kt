package lesson8

fun main() {
    print("Сколько ингредиентов вы хотите добавить? ")
    val count = readln().toInt()

    val ingredients = Array(count) { "" }

    for (i in ingredients.indices) {
        print("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Ваш список ингредиентов:")
    println(ingredients.joinToString(", "))
}
package lesson9

fun main() {
    val ingredients = mutableListOf("яйцо", "помидор", "соль")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    print("Желаете добавить еще? ")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    } else {
        println("Программа завершена.")
    }
}
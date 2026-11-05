package lesson4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_BOXES = 50

fun main() {
    println("Есть ли повреждения корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val foodBoxes = readln().toInt()

    println("Погода благоприятная? (true/false):")
    val isGoodWeather = readln().toBoolean()

    val canSail =
        (!hasDamage &&
                crew >= MIN_CREW &&
                crew <= MAX_CREW &&
                foodBoxes > MIN_FOOD_BOXES) ||
                (hasDamage &&
                        crew == MAX_CREW &&
                        isGoodWeather &&
                        foodBoxes >= MIN_FOOD_BOXES)

    println("Корабль может отправиться в плавание: $canSail")
}
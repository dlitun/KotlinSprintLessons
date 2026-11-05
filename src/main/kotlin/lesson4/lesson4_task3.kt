package lesson4

const val REQUIRED_HUMIDITY = 20
const val WINTER_SEASON = "зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"

    val areConditionsFavorable =
        isSunny &&
        isTentOpen &&
        humidity == REQUIRED_HUMIDITY &&
        season != WINTER_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areConditionsFavorable")
}
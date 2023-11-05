package kotlin_tour.control_flow.practice

fun main() {
    val button = "A"
    val result = when(button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }

    println(result)
}

package kotlin_tour.collections.practice

fun main() {
    val greenNumber = listOf(1, 4, 23)
    val redNumber = listOf(17, 2)

    val totalCount = redNumber.count() + greenNumber.count();

    println("Lists in total contains $totalCount elements.")
}

package kotlin_tour.collections.practice

fun main() {
    val numberToWord = mapOf(1 to "one", 2 to "two", 3 to "three")
    val number = 2
    println("$number is spelt as '${numberToWord[number]}'")
}

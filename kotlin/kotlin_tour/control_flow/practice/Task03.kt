package kotlin_tour.control_flow.practice

fun main() {
    for(number in 1..100) {
        val word = when{
            number % 15 == 0 -> "fizzbuzz"
            number % 5 == 0 -> "buzz"
            number % 3 == 0 -> "fizz"
            else -> number.toString()
        }
        println(word)
    }
}

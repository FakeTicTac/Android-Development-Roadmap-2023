package kotlin_tour.control_flow.practice

fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if(word.startsWith('l')) {
            println(word)
        }
    }
}

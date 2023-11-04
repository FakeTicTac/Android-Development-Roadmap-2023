package kotlin_tour.hello_world

fun main() {
    // 1. Standard output functions
    println("Hello, World!")
    print("Hello, Kotlin!")

    // 2. Variables and string templates
    val popcornBoxes = 5

    // ERROR: value is unchangeable
    // popcornBoxes = 10

    var popcornLovers = 10
    println("There is $popcornLovers people that love popcorn.")

    // Some people stopped loving popcorn.
    popcornLovers = 5 
    println("There is only $popcornLovers people that love popcorn now!")
}

package kotlin_tour.basic_types

fun main() {
    // 01. Basic operations
    var customers = 10

    customers -= 2 // Some customers left the queue
    customers += 10 // Some customers came to the queue
    customers *= 2 // Customers amount was multiplied
    customers /= 10 // Customers amount was divided

    println(customers)

    // 02. Kotlin types
    val someInt: Int = 10
    val someString: String = "This is String"
}

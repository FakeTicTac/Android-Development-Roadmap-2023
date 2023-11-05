package kotlin_tour.control_flow

fun main() {

    // 01. If else
    val number: Int
    val isCheck = true

    // We can make assigment using this syntax based on boolean
    // NB! There is no ternary operator condition ? then : else in Kotlin.
    number = if (isCheck) 1 else 2
    println(number)

    // 02. When

    // When statement
    val sentence = "Hello!"

    when(sentence) {
        "Hello!" -> println("It's greeting")
        "1" -> println("It's one")
        else -> println("Unknown")
    }

    // When expression - should return value
    val result = when(sentence) {
        "Hello!" -> "It's greeting"
        "1" -> "It's one"
        else -> "Unknown"
    }
    println(result)

    // We can omit () and write for each case boolean expression
    val age = 12

    val permission = when {
        age < 10 -> "You have no permission"
        age in 10..17 -> "You hava some permissions"
        age >= 18 -> "You have all permissions"
        else -> "You are an alien"
    }
    println(permission)

    // 03. Ranges

    // Ranges are created using '..'
    val rangeOne = 1..4 // 1, 2, 3, 4
    val rangeTwo = 1..<4 // 1, 2, 3
    val rangeThree = 4 downTo 1 // 4, 3, 2, 1
    val rangeFour = 10..100 step 2 // 10, 12, 14..

    // 04. Loops

    // For loop using ranges
    for (item in rangeOne) {
        println(item)
    }

    // For loop using collections
    val fruits = listOf("orange", "banana", "apple")
    for (fruit in fruits) {
        println(fruit)
    }

    // While loop - executes while true
    var eatenCakes = 0
    while(eatenCakes < 3) {
        println("Eat a cake")
        eatenCakes++
    }

    // Do while - executes and then checks if true
    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < eatenCakes)

}

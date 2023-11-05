package kotlin_tour.functions

fun main() {

    // 01. Functions
    hello()
    println(sum(2, 10))

    // Functions with named arguments
    printMessageWithPrefix(
        prefix = "Log",
        message = "Hello!"
    )

    // Functions with default parameters
    printMessageWithPostfix(
        postfix = "Log",
        message = "Hello again!"
    )

    printMessageWithPostfix("Hello one more time")

    // Functions without return have type of Unit

    // Single expression functions (basically one-liners)
    println(oneLinerSum(10, 20))

    // 02. Lambda
    val uppercaseString = { string: String -> string.uppercase() }
    println(uppercaseString("hello"))

    // Useful for example with .filter() function
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positiveNumbers = numbers.filter { x -> x > 0 }
    val negativeNumbers = numbers.filter { x -> x < 0 }

    println(positiveNumbers)
    println(negativeNumbers)

    // Useful for example with .map() function
    val doubledNumbers = numbers.map { x -> x * 2 }
    val tripledNumbers = numbers.map { x -> x * 3 }

    println(doubledNumbers)
    println(tripledNumbers)

    // 03. Function types
    val uppercaseSpecifiedString: (String) -> String = { string -> string.uppercase() }
    println(uppercaseSpecifiedString("how are you?"))

    // No parameters means empty () and no return type means type of Unit
    val doingNothing: () -> Unit = { println("Doing nothing") }
    doingNothing()

    // Lambda function can be returned from function
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes
        .map(min2sec)
        .sum()
    println(totalTimeInSeconds)

    // We can invoke lambda without saving it to variable and passing parameters right away
    println({ string: String -> string.lowercase() }("HELLO"))

}

fun hello() {
    println("Hello, my friend!")
}

fun sum(x: Int, y: Int) : Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun printMessageWithPostfix(message: String, postfix: String = "Info") {
    println("$message [$postfix]")
}

fun oneLinerSum(x: Int, y: Int) : Int = x + y

fun toSeconds(time: String) : (Int) -> Int = when(time) {
    "hour" -> { value -> value * 3600 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

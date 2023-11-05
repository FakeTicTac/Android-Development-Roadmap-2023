package kotlin_tour.null_safety

fun main() {

    // 01. Null value

    var neverNull: String = "Hello, Kotlin!"
    // neverNull = null

    var canBeNull: String? = "Hello, Kotlin!"

    var defaultNonNullable = "Hello, Kotlin"
    // defaultNonNullable = null

    // Check for null values
    // canBeNull.length

    // Safety check

    if (canBeNull != null) {
        println(canBeNull.length)
    }

    canBeNull = null
    println(canBeNull?.length)

    // Elvis operator (?:)
    println(canBeNull?.length ?: "It's null :(")

}

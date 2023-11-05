package kotlin_tour.functions.practice

fun main() {

    println(intervalInSeconds(1, 20, 15))

    println(intervalInSeconds(
        minutes = 1,
        seconds = 25
    ))

    println(intervalInSeconds(2))

    println(intervalInSeconds(
        minutes = 10,
    ))

    println(intervalInSeconds(
        hours = 1,
        seconds = 1
    ))
}

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

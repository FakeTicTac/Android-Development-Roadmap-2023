package kotlin_tour.functions.practice

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val circleRadius = 20
    println("Area of circle with radius m $circleRadius equals to ${circleAreaOne(circleRadius)} m.")
}

fun circleAreaOne(radius: Int): Double {
    return PI * radius * radius
}

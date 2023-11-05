package kotlin_tour.functions.practice

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val circleRadius = 20
    println("Area of circle with radius m $circleRadius equals to ${circleAreaTwo(circleRadius)} m.")
}

fun circleAreaTwo(radius: Int): Double = PI * radius.toDouble().pow(2)

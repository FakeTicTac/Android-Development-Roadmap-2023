package kotlin_tour.classes.practice

import kotlin.random.Random

data class NewEmployee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {

    val employee = listOf("Roman", "Daniel", "Tom")

    fun generateEmployee() = NewEmployee(employee.random(), (minSalary..maxSalary).random())
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())

    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}

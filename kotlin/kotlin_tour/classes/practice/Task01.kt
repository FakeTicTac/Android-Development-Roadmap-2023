package kotlin_tour.classes.practice

fun main() {
    val emp = Employee("Mary", 20)
    println(emp)

    emp.salary += 10
    println(emp)
}

data class Employee(val name: String, var salary: Int)

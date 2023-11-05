package kotlin_tour.null_safety.practice

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
}

data class EmployeeTwo(val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> EmployeeTwo("Mary", 20)
    2 -> null
    3 -> EmployeeTwo("John", 21)
    4 -> EmployeeTwo("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

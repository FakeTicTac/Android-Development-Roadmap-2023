# Practice

## Task 01:

Define a data class Employee with two properties: one for a name, and another for a salary. 
Make sure that the property for salary is mutable, otherwise you won’t get a salary boost at the end of the year! 
The main function demonstrates how you can use this data class.

```
// Write your code here

fun main() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}
```

## Task 02:

To test your code, you need a generator that can create random employees. 
Define a class with a fixed list of potential names (inside the class body), and that is configured by a minimum 
and maximum salary (inside the class header). Once again, the main function demonstrates how you can use this class.

```
import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

// Write your code here

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
```

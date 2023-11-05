package kotlin_tour.classes

fun main() {

    // 01. Classes

    // Creating class instance
    val customer = CustomerTwo(1, "example@kotlin.com")

    // Accessing properties of the class instance
    println(customer.id)
    println(customer.email)

    // We made email as mutable property, so let's change it
    customer.email = "example2@kotlin.com"
    println(customer.email)

    // Member functions
    customer.introducePerson()

    // Data classes come up with functions .toString(), .equals(), .copy()
    val userOne = User("Roman", 1)
    println(userOne.toString())

    val userTwo = User("Roman", 1)
    val userThree = User("Alex", 2)

    println("userOne == userTwo: ${userOne == userTwo}")
    println("userOne == userThree: ${userOne == userThree}")

    // Copying classes
    println(userOne.copy())
    println(userOne.copy(
        name = "Fred"
    ))
    println(userOne.copy(
        id = 20
    ))
}

// Classes implementation below

class CustomerOne

class CustomerTwo(val id: Int, var email: String) {

    fun introducePerson() = println("Hello, it's me and my email is $email.")

}

class CustomerThree(val id: Int, var email: String) {
    val category: String = "reader"
}

class CustomerFour(val id: Int, var email: String = "example@kotlin.com")

// Data classes implementation below

data class User(val name: String, val id: Int)

package kotlin_tour.collections

fun main() {

    // 01. List - Ordered collections of items

    // Read-only lists
    val readOnlyShapesOne = listOf("triangle", "square", "circle")
    val readOnlyShapesTwo: List<String> = listOf("triangle", "square", "circle")

    println(readOnlyShapesOne)
    println(readOnlyShapesTwo)

    // Mutable lists
    val mutableShapesOne = mutableListOf("triangle", "square", "circle")
    val mutableShapesTwo: MutableList<String> = mutableListOf("triangle", "square", "circle")

    println(mutableShapesOne)
    println(mutableShapesTwo)

    // Accessing values from lists happens using indexes (There is also .first() and .last() functions)
    println(mutableShapesTwo[1])
    println(mutableShapesTwo.first())
    println(mutableShapesTwo.last())

    // We can count the amount of elements in the list using .count() function
    println("There are ${mutableShapesTwo.count()} elements in list.")

    // We can check if interested us element exists in the list using keyword "in"
    println("Element 'triangle' is in the list: ${"triangle" in mutableShapesTwo}.")
    println("Element 'line' is in the list: ${"line" in mutableShapesTwo}.")

    // We can add element to the mutable list or remove them using functions .add() and .remove()
    println("List before changes: $mutableShapesOne")

    mutableShapesOne.add("line")
    println("List after addition: $mutableShapesOne")

    mutableShapesOne.remove("triangle")
    println("List after removal: $mutableShapesOne")

    // 02. Sets - Unique unordered collections of items

    // Read-only set
    val readOnlySetOne = setOf("apple", "banana", "cherry", "cherry")
    val readOnlySetTwo: Set<String> = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlySetOne)
    println(readOnlySetTwo)

    // Mutable set
    val mutableSetOne = mutableSetOf("apple", "banana", "cherry", "cherry")
    val mutableSetTwo: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(mutableSetOne)
    println(mutableSetTwo)

    // We can count the amount of elements in set using .count() function
    println(mutableSetOne.count())

    // We can check if element exists in the set using keyword 'in'
    println("Element 'orange' exists in set: ${"orange" in mutableSetOne}.")
    println("Element 'cherry' exists in set: ${"cherry" in mutableSetOne}.")

    // We can add elements to the set or remove them using .add() or .remove() functions
    println("Set before modification: $mutableSetOne.")

    mutableSetOne.add("orange")
    println("Set after element addition: $mutableSetOne")

    mutableSetOne.remove("cherry")
    println("Set after element removal: $mutableSetOne")

    // 03. Maps - Sets of key-value pairs where keys are unique and map to only one value

    // Read-only map
    val readOnlyMapOne = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val readOnlyMapTwo: Map<String, Int> = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyMapOne)
    println(readOnlyMapTwo)

    // Mutable map
    val mutableMapOne = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val mutableMapTwo = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(mutableMapOne)
    println(mutableMapTwo)

    // We can access value from the map using [] and inserting there our key value.
    println("Value of key 'orange' is ${mutableMapOne["orange"]}")

    // We can get number of element in map using function .count()
    println("There are ${mutableMapOne.count()} elements in map.")

    // We can modify map by adding or removing key-value pairs. Functions .put() and .remove() perform this operations.
    println("Map state before modifying: $mutableMapOne")

    mutableMapOne.put("banana", 200) // NB! we can also do it using []
    mutableMapOne["pineapple"] = 120
    println("Map state after pair addition: $mutableMapOne")

    mutableMapOne.remove("orange")
    println("Map state after pair removal: $mutableMapOne")

    // We can also check if given element is inside Map by using .containsKey() function.
    println("Map contains key 'kiwi': ${mutableMapOne.containsKey("kiwi")}.")
    println("Map contains key 'coconut': ${mutableMapOne.containsKey("coconut")}.")

    // We can access all map keys or values properties.
    println("Map all keys: ${mutableMapOne.keys}.")
    println("Map all values: ${mutableMapOne.values}.")

}

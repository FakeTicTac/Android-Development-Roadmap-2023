# Practice

## Task 01:

Using a when expression, update the following program so that when you 
input the names of GameBoy buttons, the actions are printed to output.

| Button | Action                  |
|--------|-------------------------|
| A      | Yes                     | 
| B      | No                      | 
| X      | Menu                    | 
| Y      | Nothing                 | 
| Other  | There is no such button | 

```
fun main() {
    val button = "A"

    println(
        // Write your code here
    )
}
```

## Task 02:

You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:

* Use a while loop.
* Use a do-while loop.

```
fun main() {
    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
```

## Task 03:

Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally, 
replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz". 
Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".

```
fun main() {
    // Write your code here
}
```

## Task 04:

You have a list of words. Use for and if to print only the words that start with the letter l.

```
fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    // Write your code here
}
```

/*
2
Topics covered here:
Functions
 */

fun getGreeting(): String { // It is declared that this function will declare a String.
    return "Hello Kotlin"
}

fun getNull(): String? { // A method can return a null variable.
    return null
}

fun sayHello(): Unit { // Unit in Kotlin is like saying this method will return nothing useful.
    println(getGreeting())
}

fun sayHelloNoUnit() { // The return type of Unit can be omitted.
    println(getGreeting())
}

fun getWord(): String = "Word" // this is a "Single Expression Function"
fun getOtherWord() = "Other word" /* this is a "Single Expression Function" that is written in a different way.
                                     Kotlin uses type inference. It can tell what sort of information we are returning,
                                     so it is not necessary to always state the return type. */

fun sayHi1(itemToGreet: String){ // this function takes a string and calls that string itemToGreet
    val msg = "Hi $itemToGreet"  // it then concats the itemToGreet with Hi
    println(msg) // it prints the contents of msg
}

fun sayHi2(itemToGreet: String) = println("Hello $itemToGreet") // this is shorthand notation of the sayHi() function.

fun sayHi3(hello:String, there:String) = println("$hello $there") // this function takes 2 variable parameters.

fun main(){
    println(getGreeting()) // this prints what the getGreeting method call returns.
    println(getNull())

    sayHello()
    sayHelloNoUnit() // this works without the Unit return type being declared.

    println(getWord())
    println(getOtherWord())

    sayHi1("there") // this calls a function that takes a String and concats the String to a local variable.
    sayHi2("Ethan")
    sayHi3("Hello", "there")
}
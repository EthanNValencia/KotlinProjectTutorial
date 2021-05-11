/*
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

fun main(){
    println(getGreeting()) // this prints what the getGreeting method call returns.
    println(getNull())

    sayHello()
    sayHelloNoUnit() // this works without the Unit return type being declared.

    println(getWord())
    println(getOtherWord())
}
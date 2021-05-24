/*
#11
Topics covered here:
Higher order functions

Higher order functions are functions that take other functions as parameters. They are also
functions that return other functions. They can add a layer of functionality on top of
simple functions. 
*/


/*
This function takes a List, has a predicate Function that requires a String, and returns a boolean.
*/
fun printFilterStrings(list: List<String>, predicate: ((String) -> Boolean)?) { // This method can now take null as a parameter.
    list.forEach {
        if (predicate?.invoke(it) == true) { // We pass in it (a string) to predicate.
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("T")
}

fun getPrintPredicate(): (String) -> Boolean {
    return {it.startsWith("O")}
}

fun main() {
    val list = listOf<String>("One", "One", "Two", "Three", "Six")
    printFilterStrings(list) { it.startsWith("T") }
    printFilterStrings(list, null) // Now the method can accept null values.

    printFilterStrings(list, predicate) // This uses the predefined predicate val, rather than taking a direct String or char.
    printFilterStrings(list, getPrintPredicate())
}
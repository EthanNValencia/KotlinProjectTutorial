/*
#11
Topics covered here:
Higher order functions

*/


/*
This function takes a List, has a predicate Function that requires a String, and returns a boolean.
*/
fun printFilterStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if (predicate(it)) { // We pass in it (a string) to predicate.
            println(it)
        }
    }
}

fun main() {
    val list = listOf<String>("One", "One", "Two", "Three")
    printFilterStrings(list) { it.startsWith("T") }
}
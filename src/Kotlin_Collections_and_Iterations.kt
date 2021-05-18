/*
#3
Topics covered here:
Collections,
Iterations

Kotlin differentiates between mutable and immutable collection types,
this is similar to how Kotlin differentiates between null and non-null values.
 */



fun helloFunction(hello:String, items:List<String>) {
    items.forEach { items ->
        println("$hello $items")
    }
}

// vararg variable number of arguments, this will be treated as an array of whatever type it is specified (String in this case).
fun helloFunction(hello:String, vararg items:String) {
    items.forEach { items ->
        println("$hello $items")
    }
}

fun greetPerson(greeting:String = "Hello", name:String = "Ethan") = println("$greeting $name") // Hello and Ethan are the default values, but they can be overided

fun main(){

    val stuffArray = arrayOf("Stuffs", "Things", "Even more stuffs")
    println(stuffArray.asList())
    println(stuffArray.size)
    println(stuffArray[0])
    println(stuffArray.get(0))

    println("----------------")
    println("------Array-----")
    for (stuffArray in stuffArray){
        println(stuffArray)
    }

    println("----------------")
    stuffArray.forEach { stuffArray ->
        println(stuffArray)
    }

    println("----------------")
    stuffArray.forEachIndexed {index, stuffArray ->
        println("$stuffArray is at index: $index")
    }

    println("----------------")
    println("------List------")
    val list = listOf("Zero", "One", "Two", "Three", "Four")
    list.forEach { list -> // this iterates through the list.
        println(list)
    }

    println("----------------")
    println("------Map-------")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    // Kotlin iterates through the map using the key and it's associated value
    map.forEach{key, value -> println("$key -> $value")}
    println("----------------")


    // Mutable list
    println("----------------")
    println("--Mutable List--")
    val mutableList = mutableListOf("Zero", "One", "Two", "Three", "Four")
    mutableList.forEach{mutableList -> print("$mutableList ")}
    println()
    mutableList.add("ADDED")
    mutableList.forEach{mutableList -> print("$mutableList ")}
    println("\n----------------")

    println("----------------")
    println("-Function List--")
    helloFunction("Number:", list)
    helloFunction("Empty") // nothing will be printed out, but this will not throw an error.
    helloFunction("Hi", "Kotlin","Android","Programming") // All of these items will be grouped together and treated as an array.
    val thingArray = arrayOf("Kotlin","Android","Programming")
    helloFunction("Hello", *thingArray) // * is called the "spread operator", so I am passing in the array as a vararg parameter.
    println("----------------")

    println("---Specified----")
    println("---Arguments----")
    greetPerson() // uses the default greeting and name values.
    greetPerson("Hello", "Ethan")
    greetPerson(greeting = "Hello", name = "Ethan") // I am effectively leveraging default parameter values.
    greetPerson(name = "Ethan", greeting = "Hello")
    // The above lines have the same results.
    // Tutorial video claims that when using specified argument syntax, all parameters must be named.
    helloFunction(hello = "Hello", *thingArray)
    // But the above line ^ works.
    println("----------------")
}



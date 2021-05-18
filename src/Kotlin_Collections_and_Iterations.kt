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
    helloFunction("Hello", list)
    println("----------------")
}



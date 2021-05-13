/*
#3
Topics covered here:
Collections,
Iterations
 */

fun main(){

    val stuffArray = arrayOf("Stuffs", "Things", "Even more stuffs")
    println(stuffArray.asList())
    println(stuffArray.size)
    println(stuffArray[0])
    println(stuffArray.get(0))
    println("----------------")
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

    list.forEach { list ->
        println(list)
    }

    println("----------------")

}
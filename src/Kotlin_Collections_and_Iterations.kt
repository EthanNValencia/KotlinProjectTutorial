/*
3
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
}
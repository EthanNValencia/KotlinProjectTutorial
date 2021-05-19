/*
#6
Topics covered here:
Interfaces

In Kotlin, an interface can implement a default method content.
*/



interface Kotlin_PersonInfoProvided {

    //val providerInfo:String = "ERROR" // property initializers are NOT allowed in interfaces
    val providerInfo:String

    fun printInfo(person: Person) {
        println("Info and stuff" + person.printInfo()) // The interface has default method contents.
    }

}

// abstract class will allow me to implement an interface without having to use all it's functions.
class BasicInfoProvider : Kotlin_PersonInfoProvided { // this class implements an interface

    override val providerInfo:String
        get() = "Basic Information"

    //override fun printInfo(person: Person) { // Java has an override annotation, but in Kotlin the override is required.

    //}
}

fun main(){
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}
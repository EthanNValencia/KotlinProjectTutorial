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

interface SessionInfoProvider{
    fun getSessionId():String
}

// abstract class will allow me to implement an interface without having to use all it's functions.
class BasicInfoProvider : Kotlin_PersonInfoProvided, SessionInfoProvider { // this class implements an interface

    override val providerInfo:String
        get() = "Basic Information"

    //override fun printInfo(person: Person) { // Java has an override annotation, but in Kotlin the override is required.

    //}

    override fun getSessionId(): String {
        return "Session101"
    }
}
/*
This checks if the object implements SessionInfoProvider.
By using !is I can determine if something "is not" something.
*/
fun checkType(infoProvider: Kotlin_PersonInfoProvided){
    if(infoProvider is SessionInfoProvider){ // this checks if the object implements SessionInfoProvider
        println("IP is SIP")
        (infoProvider as SessionInfoProvider).getSessionId() // this casts infoProvider as a SessionInfoProvider
    } else {
        println("IP is not SIP")
    }
}

fun main(){
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    println(provider.getSessionId())

    checkType(provider)
}
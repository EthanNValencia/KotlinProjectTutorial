/*
#6
Topics covered here:
Inheritance

In Kotlin, by default, classes are closed. What this means is that they cannot be extended.
*/

class Kotlin_Inheritance {
}

class FancyInfoProvider: BasicInfoProvider(){
    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) { // 1 hour and 39 minutes
        println("Fancy info provider")
    }
}
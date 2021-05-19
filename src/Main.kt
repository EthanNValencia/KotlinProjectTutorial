/*
#5
Topics covered here:
Class (works with Kotlin_Person class file)

 */



fun main(){
    println("-- Person 1 --")
    val person = Person("Ethan", "Nephew") // no "new" keyword is used here.
    person.nickName = "Shady"
    println(person.first_Name + " " + person.last_Name + " " + person.nickName) // no getter is being used here.
    person.nickName = "Other"
    person.printInfo()
    println("--------------")
    println("-- Person 2 --")
    val person2 = Person()
    person2.printInfo()
    println("--------------")

}
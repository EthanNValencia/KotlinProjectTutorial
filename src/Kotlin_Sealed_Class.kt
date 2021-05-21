import java.util.*

/*
#10
Topics covered here:
Sealed Class, data classes, comparing data classes

*/

/*
The enum class allows the ability to differentiate between different types of object instances.
*/
enum class Entity_Type_SC {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize() // This converts the string to lowercase and then capitalizes the first letter.
}

object Entity_Factory_SC {
    fun create(type: Entity_Type_SC) : Entity_SC { // By passing in an Entity_Type_SC.(...) object, it allows me to create a different instance type.
        val id = UUID.randomUUID().toString() // This generates a random sequence.
        val name = when(type){ // These are ENUM classes.
            Entity_Type_SC.EASY -> type.getFormattedName()
            Entity_Type_SC.MEDIUM -> type.getFormattedName()
            Entity_Type_SC.HARD -> type.getFormattedName()
            Entity_Type_SC.HELP -> type.getFormattedName()
        }
        return when(type){ // These are SEALED classes.
            Entity_Type_SC.EASY -> Entity_SC.Easy(id, name)
            Entity_Type_SC.MEDIUM -> Entity_SC.Medium(id, name)
            Entity_Type_SC.HARD -> Entity_SC.Hard(id, name, 2f)
            Entity_Type_SC.HELP -> Entity_SC.Help
        }
    }
}

/*
With a sealed classes the compiler performs smart casting to
*/
sealed class Entity_SC () {
    object Help : Entity_SC() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String) : Entity_SC()
    data class Medium(val id: String, val name: String) : Entity_SC()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity_SC()
}

/*
This is a function for the data class Medium, but it is not actually within the Medium declaration body.
This is kind of an easy way to add functions without having them inside the data class body.
*/
fun Entity_SC.Medium.printInfo(){
    println("Medium class: $id")
}
/*
This is similar to the above function, but it is basically a standard getter function.
*/
val Entity_SC.Medium.info: String
    get() = "some info"

fun main(){
    val entity: Entity_SC = Entity_Factory_SC.create(Entity_Type_SC.EASY)
    val msg = when (entity) {
        Entity_SC.Help -> "Help class"
        is Entity_SC.Easy -> "Easy class"
        is Entity_SC.Medium -> "Medium class"
        is Entity_SC.Hard -> "Hard class"
    }
    println(msg)


    val entityEasy1 = Entity_Factory_OD.create(Entity_Type_OD.EASY)
    val entityEasy2 = Entity_Factory_OD.create(Entity_Type_OD.EASY)

    /*
    entityEasy1 and entityEasy2 are not actually equal.
    */
    if (entityEasy1 == entityEasy2){
        println("Equal")
    } else if (entityEasy1 != entityEasy2){
        println("They are not equal.")
    }


    /*
    These entities are actually data types. Now we are comparing data to other data.
    */
    val entity1 = Entity_SC.Easy("id", "name")
    val entity2 = Entity_SC.Easy("id", "name")

    if (entity1 == entity2){
        println("Equal")
    } else if (entity1 != entity2){
        println("They are not equal.")
    }

    /*
    Here I am copying the data from entity1 to entity3, but I am re-assigning the name to "other".
    This is very useful for copying and making changes to copied data.
    */
    val entity3 = entity1.copy(name = "other")
    println(entity3)

    if (entity1 == entity3){
        println("Equal")
    } else if (entity1 != entity3){
        println("They are not equal.") // they will not be equal.
    }

    /*
    Referential comparison
    The three === allows for referential id object comparisons. Is the object the same object?
    */
    if (entity1 === entity2){ // same data, but different objects
        println("They are the same entity.")
    } else {
        println("They are not the same entity.")
    }
    if (entity1 === entity1){ // same objects
        println("They are the same entity.")
    } else {
        println("They are not the same entity.")
    }

    Entity_SC.Medium("id", "name").printInfo() // This is calling the printInfo() function.


    /*
    This is using smart casting. If an object is a Medium, then it will have access to the
    properties that the Medium will have. If it is not a Medium object, then the program will
    still run, because the Medium function (printInfo()) will never be called.
    */
    val entity_Med_1 = Entity_Factory_SC.create(Entity_Type_SC.MEDIUM)
    if(entity_Med_1 is Entity_SC.Medium){
        entity_Med_1.printInfo()
    }

}
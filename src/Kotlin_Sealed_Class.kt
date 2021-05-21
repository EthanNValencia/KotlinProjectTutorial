import java.util.*

/*
#10
Topics covered here:
Sealed Class

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

fun main(){
    val entity: Entity_SC = Entity_Factory_SC.create(Entity_Type_SC.EASY)
    val msg = when (entity) {
        Entity_SC.Help -> "Help class"
        is Entity_SC.Easy -> "Easy class"
        is Entity_SC.Medium -> "Medium class"
        is Entity_SC.Hard -> "Hard class"
    }
    println(msg)
}
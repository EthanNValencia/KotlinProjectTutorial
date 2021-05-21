import java.util.*

/*
#9
Topics covered here:
Object Declaration, enum classes,

*/

/*
The enum class allows the ability to differentiate between different types of object instances.
*/
enum class Entity_Type_OD {
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize() // This converts the string to lowercase and then capitalizes the first letter. 
}

object Entity_Factory_OD {
    fun create(type: Entity_Type_OD) : Entity_OD { // By passing in an Entity_Type_OD.(...) object, it allows me to create a different instance type.
        val id = UUID.randomUUID().toString() // This generates a random sequence.
        val name = when(type){
            Entity_Type_OD.EASY -> type.getFormattedName()
            Entity_Type_OD.MEDIUM -> type.getFormattedName()
            Entity_Type_OD.HARD -> type.getFormattedName()
        }
        return Entity_OD(id, name)
    }
}

class Entity_OD constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main(){
    val entityMed = Entity_Factory_OD.create(Entity_Type_OD.EASY)
    println(entityMed)
}
/*
#9
Topics covered here:
Object Declaration

*/

object Entity_Factory_OD {
    fun create() = Entity_OD("ID", "Name")
}

class Entity_OD constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main(){
    val entity1 = Entity_Factory_OD.create()
    println(entity1)
}
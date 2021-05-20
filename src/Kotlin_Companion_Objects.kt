/*
#8
Topics covered here:
Companion Objects

Sometimes you need to create an object of a slight modification of some class,
without explicitly declaring a new subclass for it. Kotlin handles this case
with object expressions and object declarations.
*/

interface IdProvider {
    fun get(): String
}


class Entity private constructor(val id: String) {

    companion object Factory: IdProvider{

        fun create() = Entity(get())

        override fun get(): String {
            return "ID:124"
        }
    }
}


fun main(){
    val entity1 = Entity.Factory.create() // method 1 for calling the companion object
    val entity2 = Entity.create() // method 2 for calling the companion object
    println(entity1.id)
}
/*
#8
Topics covered here:
Companion Objects

Sometimes you need to create an object of a slight modification of some class,
without explicitly declaring a new subclass for it. Kotlin handles this case
with object expressions and object declarations.
*/


class Entity(val id: String)


fun main(){
    val entity = Entity("id")
}
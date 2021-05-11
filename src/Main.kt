


/*
Top level variables are variables that are stated outside of a method body.
*/
var topLevelVariableExample: String = "This is a top level variable. It is not contained in a method body."

/*
In Kotlin, data types are non-nullable by default. To make a variable nullable, it must have a ? after the data type.
*/
var notNullable: String = "Can't be null"
var nullable: String? = null // the ? allows the value to be null

fun main(){
    /*
    VAR are mutable/changeable variables.
    VAL are immutable/read-only variables.

    variable_type name: data_type = assignment
    */
    val immutable: String = "This is immutable"
    println(immutable)
    /*
    name = "update"
    This will not work, because name is a val and val is immutable.
    */
    var mutable: String = "This is mutable"
    println(mutable)
    mutable = "This is changed"
    println(mutable)
    /*
    If a variable is declared VAR (changeable), but it is never changed,
    then the IDE will recommend that it is made immutable.
    */
    println(topLevelVariableExample)
    topLevelVariableExample = "The top level variable has been changed." // The top level variable can be reassigned, because it is a var.
    println(topLevelVariableExample)
}
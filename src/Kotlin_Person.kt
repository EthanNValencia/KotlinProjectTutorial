/*
#4
Topics covered here:
Class

If there are no properties defined in your primary constructor, then is okay to omit it. This is similar to Java.
 */




class Person (val first_Name:String = "Default_FN", val last_Name:String = "Default_LN") { // two parameters that are required for a person class

    var nickName: String? = null
        set(value) { // this is overriding the default getter for the nickName variable.
            field = value
            println("The new nickname is $value")
        }

        get() { // this is overriding the default setter for the nickName variable.
            println("The returned value is $field")
            return field
        }


    fun printInfo(){
        // val nickNameToPrint = if(nickName != null) nickName else "no nickname" // Technique 1
        val nickNameToPrint = nickName ?: "no nickname" // ?: This is the "Elvis Operator" it checks if something is null or not.
        println("$first_Name ($nickNameToPrint) $last_Name")
    }

    init { // init block runs before secondary constructor
        println("Init 1")
    }
    constructor(): this("John", "Smith"){ // this is a secondary constructor
        println("Secondary constructor")
    }
    init { // init block runs before secondary constructor
        println("Init 2")
    }

    /*
    This is another way of assigning values to the Person.
    val firstName:String
    val lastName:String

    init { // the init block is run anytime this class is instantiated.
        firstName = first_Name
        lastName = last_Name
    }
    */

    /*
    Alternatively, the data values can be assigned using a more traditional Java approach.
    val firstName:String = first_Name
    val lastName:String = last_Name
    */
}
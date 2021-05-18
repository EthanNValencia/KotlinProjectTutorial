/*
#4
Topics covered here:
Class

If there are no properties defined in your primary constructor, then is okay to omit it. This is similar to Java.
 */




class Person (val first_Name:String, val last_Name:String) { // two parameters that are required for a person class

    /*
    This is another way of assigning values to the object.
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
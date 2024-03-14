//class

class Person{
    //attributes/properties
    var name = "John"
    var age = 67
    var gender = "male"

    //method/functions
    fun walk(){
        println({"Person is walking"})
    }
}

//object

fun main() {

    var accountant = Person()
    accountant.walk()

    println(accountant.gender)

}
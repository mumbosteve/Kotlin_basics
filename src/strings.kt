fun main() {
    var greetings = "Hello world"
    var firstname = "Steve"
    var lastname = "Mumbo"

    //string concatenation - combing strings
    println(firstname +" "+ lastname)
    println(firstname.plus(lastname))

    //accessing an element from a string
    println(greetings[6])
    println(greetings[6])

    //determining an index position
    println(greetings.indexOf("world"))
    println(greetings.indexOf('H'))

    //modifying a string
    println(greetings.uppercase())
    println(greetings.lowercase())

    //string interpolation
    println("Hello there,my name is $firstname $lastname")

    //size of a string
    println(greetings.length)
}
fun main() {
    //predefined functions
    println("Hello Kotlin")
    var x = Math.min(45,65)
    println(x)

    var y = Math.max(90,142)
    println("The max is $y")

    var z = Math.round(45.08)
    println(z)

    name()
    product(12,2)
    product(8,9)

    details("Steve",12)
    details("mumbo",73)
    details("jere",65)

}

//user defined functions

fun name(){
    println("mumbo")
}

fun product(num1:Int,num2:Int){
    println(num2*num1)
}

fun details(name:String,age:Int){
    println("$name is $age years old")
}
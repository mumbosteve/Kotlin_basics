//parent class/super class/base class

open class animal{
    var age = 2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//child class/subclass/derive class

class duck:animal(){
    var color = "white"
    fun sound(){
        println("Duck is quacking")
    }
}

class fish:animal(){
    var hasScale = true
    var hasFins = true

    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var a = animal()

    var d = duck()
    println(d.move("swims"))
    var tuna = fish()
}
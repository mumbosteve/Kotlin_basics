class dog(var name:String,var breed:String,var age:Int){

    fun move(movement:String){
        println("The dog is $movement")

    }
}

fun main() {
    var dog1 = dog("Bob","Bulldog",6)
    var dog2 = dog("Tobby","German Shepherd",5)
    var dog3 = dog("Tracy","Chiwawa",2)

    println(dog1.breed)
    println(dog1.name)
    println(dog1.age)

    dog1.move("walking")
    dog2.move("running")
}
import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("Enter first number: ")
    var firstnumber = input.nextInt()

    print("Enter second number: ")
    var secondnumber = input.nextInt()

    print("Enter third number: ")
    var thirdnumber = input.nextInt()

    if (firstnumber < secondnumber && firstnumber < thirdnumber) {
        println("$firstnumber is the smallest number")
    }
   else if (secondnumber < firstnumber && secondnumber < thirdnumber){
        println("$secondnumber is the smallest number")
    }
    else{
        println("$thirdnumber is the smallest number")
    }


}
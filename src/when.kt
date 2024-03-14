import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("Enter number: ")
    var day = input.nextInt()
    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else->"invalid day of the week"
    }
   println("The day is $result")
}
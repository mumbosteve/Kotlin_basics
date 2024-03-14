import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("Enter marks: ")
    var mark = input.nextInt()
    var result = when(mark){
      in 90..100 -> "A+"
        in 80 until 90 -> 'A'
        in 70 until 80 -> 'B'
        in 60 until 70 -> 'C'
        in 50 until 60 -> 'D'
        in 40 until 50 -> 'E'
        in 0 until 40 -> 'F'


        else->"invalid!"
    }

    println("Your grade is $result")
}
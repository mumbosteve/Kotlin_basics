//enter two numbers
// enter operator
//using when

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("Enter first number: ")
    var num1 = input.nextInt()

    print("Enter second number: ")
    var num2 = input.nextInt()

    print("Enter operator: ")
    var operator = input.next()
    var result = when(operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> num1 / num2
        "*" -> num1 * num2
        else->"invalid operator"
    }

    println("The answer is $result")
}
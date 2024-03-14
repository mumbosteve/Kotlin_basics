fun main() {
    //arithmetic operators
    var num1 = 45
    var num2 = 34
    var num3 = 15

    println(num3 + num2)
    println(num3 - num2)
    println(num3 / num2)
    println(num3 * num2)
    println(num3 % num2)

    //comparison operators
    println(num1 > num2)
    println(num1 >= num2)
    println(num1 < num2)
    println(num1 <= num2)
    println(num1 == num2)
    println(num1 != num2)

    //logic operators - and,or,not
    println(num1 > num2 && num1 != num2)  //and
    println(num1 > num2 || num1 != num2)  //or
    println(!(num1 > num2 || num1 != num2))  //not

    //assignment operator
    var x = 23
    x += 2
    println(x)

    var y = 45
    y %= 2
    println(y)
}
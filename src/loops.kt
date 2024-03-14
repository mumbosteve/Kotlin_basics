fun main() {
    //while loop
    var number = 200
    while (number <= 205) {
        println("number is $number")
        number++
    }

    var num1 = 100
    while (num1 >= 95) {
        println("number is $num1")
        num1--
    }

    //do...while loop
    var x = 20
    do {
        println(x)
        x++
    }while (x <= 25)

    //For Loop
    var furniture = arrayOf("chair","table","desk")
    for (z in furniture){
        println(z)
    }


    var marks = arrayOf(21,12,77,48,88)
    for (y in marks){
        println("You scored $y %")
    }

    //Range
    for (number in 30..35){
        println(number)
    }

    for (l in 'a'..'e') {
        println(l)
    }
}
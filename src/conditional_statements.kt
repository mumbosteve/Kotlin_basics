import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    print("Enter room Temperature: ")
    var temperature = reader.nextInt()
     if (temperature <= 25){
         println("It is clold")
     }
    else{
        println("It is Hot")
     }
}
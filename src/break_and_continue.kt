fun main() {
    //break
    for (x in 50..55){
        if (x == 54){
            break
        }
        println(x)
    }

    //continue
    for (character in 'A'..'E'){
        if (character == 'C'){
            continue
        }
        println("character is $character")
    }

}
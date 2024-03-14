fun main() {
    var languages = arrayOf("Kotlin","Javascript","Python","C++")
    println(languages[1])

    //reassigning  a value
    languages[1] = "PHP"
    println(languages[1])

    //looping through an array
    for (lang in languages){
        println(lang)
    }

    //checking if a value exists in an array
    if ("PHP" in languages) {
        println("It exists")
    }
    else{
        println("It does not exist")
    }
}
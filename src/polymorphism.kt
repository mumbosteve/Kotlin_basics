//parent class

open class shape{
    open fun draw(){
        println("drawing a shape")
    }
}

//child class
class rhombus:shape(){
    override fun draw(){
        println("drawing a rhombus")
    }
}

class square:shape(){
    override fun draw(){
        println("drawing a square")
    }
}

fun main() {
    var s = shape()
    s.draw()
    var r = rhombus()
    r.draw()
    var x = square()
    x.draw()
}
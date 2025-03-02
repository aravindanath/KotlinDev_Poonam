package org.example.day7


interface Dimension {
   val length : Double
   val breadth : Double
}

interface CalculateArea : Dimension {
    fun area()
    fun perimeter()
}

class xyz: CalculateArea{
    override val length: Double = 10.0
    override val breadth: Double = 20.0

    override fun area() {
        println("Area of rectangle is ${length * breadth}")
    }

    override fun perimeter() {
        println("Perimeter of rectangle is ${2 * (length + breadth)}")
    }

}


fun  main(){
    val x = xyz()
    x.area()
    x.perimeter()
}


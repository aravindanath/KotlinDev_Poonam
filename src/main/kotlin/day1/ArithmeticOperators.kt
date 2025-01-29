package org.example.day1

fun main(){

    sum(199,11)
   val x =  sum(122,11,112)
    println(x/2*66)
}


fun sum(x:Int,y:Int){
    val sumOfTwoNumbers: Int = x + y
    println("Sum of $x and $y is $sumOfTwoNumbers")
}

fun sum(x:Int,y:Int, z:Int):Int{
    return x+y+z
}
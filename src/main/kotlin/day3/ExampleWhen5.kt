package org.example.day3

import java.util.Scanner

fun main() {

    var num = 101
    when{
        isOdd(num) -> println("Number is odd")
        isEven(num) -> println("Number is even")
        else -> println("Invalid number")
    }


}

// THis is a function to check if a number is odd
fun isOdd(x:Int) = x%2 !=0
fun isEven(x:Int) = x%2 ==0



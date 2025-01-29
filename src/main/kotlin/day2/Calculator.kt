package org.example.day2

import java.util.Scanner

fun main(){

   val n1 =  Scanner(System.`in`)
    print("Enter first number: ")
    val number1 =   n1.nextInt();

    print("Enter first number: ")
    val n2 =  Scanner(System.`in`).nextInt()


   val x =  add(number1, n2)
    println("Sum of $number1 and $n2 is $x")



}


fun add(a: Int, b: Int): Int {
    return a + b
}
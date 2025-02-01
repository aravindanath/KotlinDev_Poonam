package org.example.day3

import java.util.Scanner

fun main() {


    print("Enter the Month of the Year: ")

    var num = readln()!!.toInt()

    when(num){

        in 1..3 -> println("This is the Spring Season")
        in 4..6 -> println("This is the Summer Season")
        in 7..9 -> println("This is the Rainy Season")
        in 10..12 -> println("This is the Winter Season")
        else -> println("Invalid Month")

    }


}
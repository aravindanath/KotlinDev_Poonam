package org.example.day3

import java.util.Scanner

fun main() {


    print("Enter the day of the week")

//    val name = readln()!!.toInt()

    val name = Scanner(System.`in`).nextInt()

    when (name) {
        1 -> println("Its monday")
        2 -> println("Its tuesday")
        3 -> println("Its wednesday")
        4 -> println("Its thursday")
        5 -> println("Its friday")
        6 -> println("Its saturday")
        7 -> println("Its sunday")
        else -> println("This is not a day")

    }


}
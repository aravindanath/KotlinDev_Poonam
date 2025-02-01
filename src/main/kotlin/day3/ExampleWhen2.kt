package org.example.day3

import java.util.Scanner

fun main() {


    print("Enter the Planet Name: ")

    val name = readln()!!.toString()

    when (name) {
        "Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto" -> println("This is a planet")
        else -> println("This is not a planet")
    }



}
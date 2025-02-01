package org.example.day3

fun main() {


    print("Enter the heavenly body: ")

    val name = readln()!!.toString()

    when (name) {
        "Earth" -> println("This is the third planet from the sun")
        "Mars" -> println("This is the fourth planet from the sun")
        "Jupiter" -> println("This is the fifth planet from the sun")
        "Saturn" -> println("This is the sixth planet from the sun")
        "Uranus" -> println("This is the seventh planet from the sun")
        "Neptune" -> println("This is the eighth planet from the sun")
        "Pluto" -> println("This is the ninth planet from the sun")
        else -> println("This is not a planet")
    }


}
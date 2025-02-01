package org.example.day3

import java.util.Scanner

fun main() {



    val value : Any = "arvind"

    when (value) {
        is Int -> println("This is an Integer")
        is String -> println("This is a String")
        is Double -> println("This is a Double")
        is Float -> println("This is a Float")
        else -> println("This is something else")
    }










}
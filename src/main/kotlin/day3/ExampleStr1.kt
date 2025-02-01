package org.example.day3

fun main() {


    var name = "Arvind"

    for ((x,char) in name.withIndex()) {
        println("Index $x, Char $char")
    }

}
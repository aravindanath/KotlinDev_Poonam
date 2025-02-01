package org.example.day3

fun main() {

    var number = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (num in number) {
        if (num % 2 == 0) {
            println("$num is even")
        }else{
            println("$num is odd")
        }

    }

}
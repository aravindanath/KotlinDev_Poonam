package org.example.day5

fun main(){

    var number = listOf(10,211,3,433,5,6)

//
//    println(fruits.indexOf(5))
//
//    println(fruits.lastIndexOf(6))

    println(number.sorted().toString())
    println(number.joinToString { it.toString() })

}
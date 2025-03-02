package org.example.day7

import org.example.day5.persons

fun main(){
    val map = mapOf("One" to 1, "Two" to 2, "Three" to 3)

    println(map.keys)
    println(map.values)
    println(map.size)

    println(map["One"])
}
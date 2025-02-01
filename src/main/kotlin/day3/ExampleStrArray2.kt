package org.example.day3

fun main() {

    var planet = arrayOf("Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto")

    for((x, y) in planet.withIndex()){
        println("Index: $x, Value: $y")
    }
}
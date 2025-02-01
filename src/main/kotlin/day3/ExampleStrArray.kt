package org.example.day3

fun main() {

    var planet = arrayOf("Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto")

    for (num in planet.indices) {
        println(planet[num])


    }

    println(planet[2])
}
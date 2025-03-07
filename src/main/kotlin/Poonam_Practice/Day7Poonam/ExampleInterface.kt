package org.example.Poonam_Practice.Day7Poonam

interface triangle{

    fun angle()
    fun sides()
}

class shapes :triangle{

    override fun sides() {

        println("it has 3 sides")
    }

    override fun angle() {
        println("it has 3 angles")
    }
}

fun main(){

    var s = shapes()
    s.angle()
    s.sides()
}


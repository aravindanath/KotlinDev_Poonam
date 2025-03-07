package org.example.Poonam_Practice.Day7Poonam

abstract class math {
    abstract fun add()
    abstract fun subtraction()
    abstract fun multiply()
    abstract fun divide()
    fun math1() {
        println("perform math")
    }
}

class subject : math(){
    override fun add() {
        println("addition")
    }

    override fun subtraction() {
        println("subtraction")
    }

    override fun multiply() {
        println("multiplication")
    }

    override fun divide() {
        println("division")
    }

}

fun main(){
    val sub = subject()
    sub.add()
    sub.subtraction()
    sub.multiply()
    sub.divide()
    sub.math1()

}
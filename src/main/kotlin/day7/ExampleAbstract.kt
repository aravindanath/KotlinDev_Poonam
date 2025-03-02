package org.example.day7

abstract class Vehical{
    // Abstract method
    abstract fun start()
    abstract fun stop()
    abstract fun move()
    // Non Abstract method
    fun display(){
        println("I am display method")
    }
}

class Bmw : Vehical(){
    override fun start() {
        println("BMW started")
    }

    override fun stop() {
        println("BMW stopped")
    }

    override fun move() {
        println("BMW moving")
    }

}

fun main(){
    val bmw = Bmw()
    bmw.start()
    bmw.move()
    bmw.stop()
    bmw.display()
}
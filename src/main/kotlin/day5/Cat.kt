package org.example.day5

import org.example.day6.Animal

class Cat : Animal() {

    fun meow(){
        println("Meow")
    }

}

fun main(){
   val c =  Cat()
    c.meow()
    c.vaccination()

}
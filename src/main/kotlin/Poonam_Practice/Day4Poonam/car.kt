package org.example.Poonam_Practice.Day4Poonam

class Car{

    var name:String = ""
    var year :Int =0
    var model :String =""


    fun breaking(){

        println("press the break")

    }
    fun accelerate(){

        println("vroom vromm")
    }




}

fun main(){

    val car = Car()
    car.name="Honda"
    println(car.name)
    car.year=2020
    println(car.year)
    car.model="Accord"
    println(car.model)
    car.breaking()
    car.accelerate()


}
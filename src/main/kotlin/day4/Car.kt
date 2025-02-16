package org.example.day4


class Car{ // class Header

    // class body

    // Class Properties
    var make: String = ""
    var model: String = ""
    var year: Int = 0


    // Class Members
    fun accelerate(){
        println("Vroom Vroom")
    }

    fun service(){
        println("Car is being serviced")
    }

}

fun main(){

    val car =  Car()
    car.make = "Toyota"
    println(car.make)
    car.model = "Camry"
    println(car.model)
    car.year = 2020
    println(car.year)

    car.accelerate()

}


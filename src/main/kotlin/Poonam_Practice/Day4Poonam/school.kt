package org.example.Poonam_Practice.Day4Poonam

import java.util.Scanner

class School{
    var name :String="sister nivedita"
    var city :String="Mumbai"

    fun department(){
        println("School has multiple departments.Which one you want to enter")
        val dept = Scanner(System.`in`).nextLine()
        println("You will need to contact to $dept. call given phone number ")

        when(dept){

           "Math","Chem","Science"-> println("phone number is 9852456252")
            "English","Hindi","Marathi" -> println("phone number is 9652451258")
            else-> println("Unknown dept")
        }

    }



}
fun main(){
    val school = School()
    school.name
    println(school.name)

    school.city
    println(school.city)
    school.department()

}
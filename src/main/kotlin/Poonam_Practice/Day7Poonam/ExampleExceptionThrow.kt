package org.example.Poonam_Practice.Day7Poonam

import java.util.Scanner

fun main(){

    println("Enter password")
    var password = Scanner(System.`in`).nextLine()
    if(password.length<10){
        throw Exception("password should have 10 or more characters ")
    }
else{
    println("Strong password")
}

}
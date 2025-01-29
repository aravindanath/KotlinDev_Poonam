package org.example.day2

import java.util.Scanner

fun main(){

    print("Enter your age: ")
    val age = Scanner(System.`in`).nextInt()

    if (age >=18 && age <=100){
        println("You are eligible to vote")
    }else if (age < 18){
        println("You are not eligible to vote")
    }else{
        println("Invalid age")
    }

}
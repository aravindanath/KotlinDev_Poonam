package org.example.day2

import java.util.Scanner

fun main(){

    print("Enter your age: ")
    val marks = Scanner(System.`in`).nextInt()

    if(marks<35){
        println("You are failed")
    }else if(marks>=35 && marks<60) {
        println("You are Second class")        }
    else if(marks>=60 && marks<75){
        println("You are First class")
    }else if(marks>=75 && marks<=100) {
        println("You are Distinction")
    }else{
        println("Invalid marks")
    }

}
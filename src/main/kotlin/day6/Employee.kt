package org.example.day6


/**
 * // Base class // Super class
 *  open class baseClass(x:int){
 *  }
 *  class derivedclass(x:int) :baseClass(x){
 *
 *  }
 *
 *
 */
// Base Class / Super class / Parent
open class Employee(name: String, age: Int, salary: Int) {

    //init block // primary constructor block
    init {
        println("My name is $name ,$age year old and earning $salary ")
    }

    fun iamADeveloper(){
        println("I am dev")
    }

}

// Derived Class / Child class
class WebDeveloper(name: String, age: Int, salary: Int) : Employee(name, age, salary){

    fun webSite(){
        println(" i am a web developer")
    }

}

class AndroidDeveloper(name: String, age: Int, salary: Int) : Employee(name, age, salary){
    fun app(){
        println(" i am a android app developer")
    }
}

fun main(){

    val wd = WebDeveloper("Arvind", 33, 100000);
    wd.webSite()
//    wd.iamADeveloper()

    val android = AndroidDeveloper("Anusha", 32, 100300);
    android.app()
}
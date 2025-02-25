package org.example.Poonam_Practice.day5

fun main(){
    var name = listOf("Poonam","Inaya","Idha")
    if (name.contains("Idha")){

        println(true)
    }
    else{
        println(false)
    }

    if(name.isEmpty()){
        println("list is empty")
    }
    else{
        println("list has items")
    }

   var filtername= name.filter { it.startsWith("I") }
    println(filtername)

    println(filtername.size)
    println(name.size)

    var newName= filtername + name

        println(newName)

    if (name.containsAll(filtername)){
        println("true")}
        else{
            println("false")
        }

}
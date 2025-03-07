package org.example.Poonam_Practice.Day6Poonam

class A{
    var a=10
    fun a(){
        println(a)
    }
}


class B{
    fun b(){
        val b=20
        println(b)

    }


}

fun main(){

    val a= A()
    a.a()

    val b = B()
    b.b()

  val newc= C()
    newc.c()

   // val newD = D()
    //newD.d   class D is private class so can not be accessed from different package.it is accessible within the class
}
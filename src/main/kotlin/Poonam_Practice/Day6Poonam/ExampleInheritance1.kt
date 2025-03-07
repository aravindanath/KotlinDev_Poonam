package org.example.Poonam_Practice.Day6Poonam

open class person(age:Int){

    init {

        println("age of the persion is $age")
    }
        fun walk(){
            println("person can walk")

    }

}

class teacher(age:Int):person(age){
    fun teach(){
        println("teacher can teach")
    }


}

class cricketer(age:Int):person(age) {
    fun play() {

        println("cricketer can play")
    }

} fun main(){


        val t = teacher(30)
        t.teach()
    t.walk()


        val c = cricketer(20)
        c.play()



}
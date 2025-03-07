package org.example.Poonam_Practice.Day6Poonam

open class office{

   open val name ="a"
    val dept1 ="IT"
  open  fun dept(){
        println(dept1)
    }

}
class section:office(){
   override val name="b"
    override fun dept(){
        println("name is "+name+" and dept is "+dept1)


    }

}
fun main(){

    val sec = section()
    sec.dept()
    sec.dept1
    sec.name
}
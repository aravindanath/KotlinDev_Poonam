package org.example.day6

open class Employee1 {

    // Secondry constructor
    constructor(emp_id : Int, emp_name: String, emp_salary :Int){
        println("Name $emp_name, emp id $emp_id and Salary $emp_salary")
    }

}

class AndroidDev() : Employee1(222,"Advik",42322){

}
fun main(){
     AndroidDev() // object is class
}
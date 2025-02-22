package org.example.day5

class Person (var firstName: String, var lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int  = this.lastName.compareTo(other.lastName)
    override fun toString(): String = "$firstName $lastName"
}


//val persons = arrayOf(
//    Person("Ragnar", "Lodbrok"),
//    Person("Bjorn", "Ironside"),
//    Person("Sweyn", "Forkbeard")
//)

val persons = listOf(
    Person("Ragnar", "Lodbrok"),
    Person("Bjorn", "Ironside"),
    Person("Sweyn", "Forkbeard")
)


fun main() {

    persons.forEach { println(it) }

    println("******")
    persons.sorted().forEach { println(it) }

//    println(persons.joinToString())

}

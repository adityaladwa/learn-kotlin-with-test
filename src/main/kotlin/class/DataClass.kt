package `class`

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person1 = Person("Aditya", 21)
    val person2 = Person("Aditya", 21)


    println("Person 1 = $person1")
    println("Person 2 = $person2")
}
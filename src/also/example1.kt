package also

import data.Person

fun main() {
    val person = Person("John", 20).also {
        println("creating a person: $it")
        it.name = "yeye"
    }
    println(person)
}


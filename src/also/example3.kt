package also

import data.Person

fun main() {
    val person = Person("John", 30).also {
        saveToDatabase(it)
    }

    println("Person saved $person")
}

fun saveToDatabase(person: Person) {
    println("saving $person to database")
}

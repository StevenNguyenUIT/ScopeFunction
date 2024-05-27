package also

import data.Person

fun main(){
    val person = Person("John", 23,).also {
        println("original person: $it")
        it.name = "Steven"
        it.age = 30
        println("Modified person: $it")
    }

    println(person)
}
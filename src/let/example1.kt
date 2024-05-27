package let

import data.Person

//Executing a lambda on non-nullable objects: let
//
//Introducing an expression as a variable in local scope: let

fun main() {
    val person1 = Person("steve",32)
    println(person1)
    val person2 = Person("Nhinh",33).let {
        println(it)
    }
    println(person2)
    val person3 = Person("Michale",30).let {
        it.age = 12
        return@let it
    }
    println(person3)
    println(person3.age)
}




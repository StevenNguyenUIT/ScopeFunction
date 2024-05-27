package with

import data.Person

//Ví dụ 1: Sử dụng with để cấu hình đối tượng

fun main() {
    val person = Person("Peter", 43)
    val result = with(person){
        name = "Steve"
        age = 20
        "Update person $name, $age years old"
    }
    println(result)
    println(person)
}
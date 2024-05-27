package run

import data.Person

//Object configuration and computing the result: run
//Ví dụ 1: Sử dụng run để khởi tạo và cấu hình đối tượng

fun main() {
    val person = Person("John",30).run {
        20
    }
    println(person)

    val person1 = Person("John",30).run {
        name = "Kelvin"
        age = 40
        this
    }
    println(person1)
}
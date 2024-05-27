package run

import data.Person
//Ví dụ 2: Sử dụng run để thực hiện một khối mã và trả về kết quả

fun main() {
    val person = Person("John", 40)
    val greeting = person.run {
        "Hello, my name is $name and i am $age years old"
    }

    println(greeting)
}
package with

import data.Car


//Ví dụ 3: Sử dụng with để làm việc với đối tượng phức tạp

fun main() {
    val car = Car("Toyota", "Camry", 2020 )

    val description = with(car){
        val age = 2024 - year
        "This is a $brand $model from $year, which is $age years old"
    }

    println(description)
}
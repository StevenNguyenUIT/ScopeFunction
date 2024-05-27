package with

import data.Rectangle

//Ví dụ 2: Sử dụng with để tránh lặp lại tên biến

fun main() {
    val rectangle = Rectangle(3,5)

    val area = with(rectangle){
        println("Calculating area for rectangle with length:$length and width:$width")
        length*width
    }

    println(area)
}
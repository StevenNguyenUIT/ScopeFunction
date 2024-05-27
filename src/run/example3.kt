package run

//Ví dụ 3: Sử dụng run để làm việc với biến nullable

fun main() {
    val name: String? = "Kotlin"
    val length = name.run {
        this?.length
    }

    println(length)
}
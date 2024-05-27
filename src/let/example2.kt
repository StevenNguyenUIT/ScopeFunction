package let

fun main() {
    val name: String? = "Steven"

    // Sử dụng let để chỉ thực hiện block nếu name không phải là null
    name?.let {
        println("the length of the name is ${it.length}")
    }

    //ket hop voi mot lam lambda tra ve 1 gia tri

    val length = name?.let {
        it.length
        35   // return at last value
    }

    println(length)


}
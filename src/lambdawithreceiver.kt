fun main() {
    fun String.printzz(int: Int){
        println("$this is $int")
    }

    val b = "test"
    b.printzz(3)

    //more example
    val printUpperCase: String.(int:Int) -> Unit = {
        println(this.toUpperCase())
    }

    val myString = "hello moto"
    myString.printUpperCase(3)

    //more example BuildString

    val message = buildString {
        append("Hello, ")
        append("world!")
    }

    println(message)
}
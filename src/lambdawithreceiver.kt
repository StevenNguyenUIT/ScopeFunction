fun main() {
    fun String.printzz(int: Int){
        println("$this is $int")
    }

    val b = "test"
    b.printzz(3)
}
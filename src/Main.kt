fun main() {
    val str = "Hello"
    str.let {
        println(it.length)
    }
    str.apply { println(this.length) }
    str.run { println(this.length) }
    str.also { println(it.length) }
    with(str) { println(this.length) }
}
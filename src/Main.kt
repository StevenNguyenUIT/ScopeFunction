fun main() {
    val str = "Hello"
    str.let {
        println(it.length)
        return@let it
    }
    str.apply {
        println(this.length)
//        return@apply this
    }
    str.run {
        println(this.length)
        return@run this
    }
    str.also {
        println(it.length)
//        return@also it
    }
    with(str) {
        println(this.length)
        return@with this
    }

}
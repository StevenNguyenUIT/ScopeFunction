package apply

fun main() {
    val person = Person("Steven", 12, "Bienhoa").apply {
        this.name = "Van"
        age = 32
        city ="TPHCM"
    }
    println(person)

}

data class Person(var name: String, var age: Int, var city: String)
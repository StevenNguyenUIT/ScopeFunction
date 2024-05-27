package apply

import data.Person

fun main() {
    val person = Person("Steven", 12, "Bienhoa").apply {
        this.name = "Van"
        age = 32
        city ="TPHCM"
    }
    println(person)
}

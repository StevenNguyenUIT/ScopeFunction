package run

import data.Config

//Ví dụ 4: Sử dụng run để thực hiện các thao tác phức tạp hơn

fun main() {
    val config = Config("Localhost",8080).run {
        //change properties
        host = "example.com"
        port = 9090

        // perform sub action
        println("Connecting to $host on port $port")

        //return the result
        "$host:$port"
    }

    println("Configuration: $config")
}
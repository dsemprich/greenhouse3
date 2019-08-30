package sample

import main.greenhouse.HumiditySensor

fun hello(): String = "Hello, Kotlin/Native!"

fun main() {
    println(hello())
    HumiditySensor().getHumidity()
}
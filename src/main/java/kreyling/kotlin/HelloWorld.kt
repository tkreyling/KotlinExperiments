package kreyling.kotlin

fun main(args: Array<String>) {
    val greeting = "Hello"

    fun greet(name: String) {
        println(greeting + ", " + name + "!")
    }

    greet("world")
}
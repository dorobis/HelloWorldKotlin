fun main(args: Array<String>) {
    println(when(args[0].toInt()) {
        in 1..11 -> "Good Morning, Kotlin!"
        else -> "Good night, Kotlin!"
    })
}
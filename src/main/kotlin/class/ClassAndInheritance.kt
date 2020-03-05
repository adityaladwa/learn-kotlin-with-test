package `class`

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

fun main() {
    val c = Constructors(10)
}
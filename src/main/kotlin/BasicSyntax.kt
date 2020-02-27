val iCantChange = 20
var iCanChange = 10

fun main() {
    lambdaExpression()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumSingleLine(a: Int, b: Int): Int = a + b

fun incrementByOne(): Int {
    return iCanChange++
}

fun maxOf(a: Int, b: Int): Int = if (a > b) a else b

// For loops

fun testLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun whenExpression(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Hello"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}

fun range() {
    for (x in 1..10 step 2) {
        println(x)
    }
}

fun lambdaExpression() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}
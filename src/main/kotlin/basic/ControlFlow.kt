package basic

val a1 = 10
val b1 = 20

val max = if (a1 > b1) a1 else b1

enum class Color {
    RED, GREEN, BLUE
}

fun getNextColor(color: Color): Color {
    return when (color) {
        Color.RED -> Color.GREEN
        Color.GREEN -> Color.BLUE
        Color.BLUE -> Color.RED
    }
}

//
//Kotlin has three structural jump expressions:
//
//return. By default returns from the nearest enclosing function or anonymous function.
//break. Terminates the nearest enclosing loop.
//continue. Proceeds to the next step of the nearest enclosing loop.

//The return-expression returns from the nearest enclosing function.
// (Note that such non-local returns are supported only for lambda expressions passed to inline functions.)
// If we need to return from a lambda expression, we have to label it and qualify the return:

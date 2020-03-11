package `class`

sealed class Expr
data class Const(val number: Int) : Expr()
data class Sum(val a: Int, val b: Int) : Expr()
object NotANumber : Expr()

fun main() {
    when (val test: Expr = NotANumber) {
        is Const -> println("Const number=${test.number}")
        is Sum -> println("Sum a=${test.a} and b=${test.b}")
        NotANumber -> println("Not a number")
    }
}
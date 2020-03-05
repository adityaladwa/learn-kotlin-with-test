package `class`

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 1)
    for (i in list) {
        println(i)
    }
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    this[index1] = this[index2].also {
        this[index2] = this[index1]
    }
}
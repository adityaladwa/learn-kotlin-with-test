package basic

val a: Int = 1000
val b: Int = 1000
val boxedA: Int? = a
val boxedB: Int? = b

//val aLong: Long = a  not possible

val aLong: Long = a.toLong()
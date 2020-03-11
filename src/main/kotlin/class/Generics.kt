package `class`

interface Foo<out T> {
    fun get(): T
}

interface Bar<in T> {
    fun set(t: T): Boolean
}

interface FooBar<T> {
    fun get(): T
    fun set(t: T): Boolean
}


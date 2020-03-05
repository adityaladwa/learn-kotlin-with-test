package `class`

import org.junit.Test
import kotlin.test.assertEquals

class ExtensionFunctionTest {

    @Test
    fun `kotlin test`() {
        val list = mutableListOf(1, 2, 3)
        list.swap(0, 1)
        assertEquals(2, list[0])
        assertEquals(1, list[1])
        assertEquals(3, list[2])
    }
}
package basic

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BasicTypeTest {

    @Test
    fun `Identity of primitive type should pass`() {
        assertEquals(a, b)
        assertTrue(a === b)
    }

    @Test
    fun `Identity of boxed type should pass`() {
        assertEquals(boxedA, boxedB)
        assertFalse(boxedA === boxedB)
    }
}
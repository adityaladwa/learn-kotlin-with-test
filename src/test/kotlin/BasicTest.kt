import org.junit.Test
import kotlin.math.max
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BasicTest {

    @Test
    fun `Sum of a and b`() {
        val expected = 4
        val actual = sum(2, 2)
        assertEquals(expected, actual)
    }

    @Test
    fun `Sum of a and b single line invocation`() {
        val expected = 4
        val actual = sumSingleLine(2, 2)
        assertEquals(expected, actual)
    }

    @Test
    fun `Increment by one`() {
        assertEquals(10, iCanChange)
        incrementByOne()
        assertEquals(11, iCanChange)
    }

    @Test
    fun `Max of`() {
        assertEquals(2, maxOf(1, 2))
        assertEquals(2, max(2, 1))
    }

    @Test
    fun `When expression`() {
        assertEquals("One", whenExpression(1))
        assertEquals("Hello", whenExpression("Hello"))
        assertEquals("Long", whenExpression(1L))
        assertEquals("Not a string", whenExpression(2.3))
        assertNotEquals("Unknown", whenExpression(Throwable()))
    }
}
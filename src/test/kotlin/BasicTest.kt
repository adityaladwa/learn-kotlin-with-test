import org.junit.Test
import kotlin.test.assertEquals

class BasicTest {

    @Test
    fun `Sum of a and b`() {
        val expected = 4
        val actual = sum(2, 2)
        assertEquals(expected, actual)
    }
}
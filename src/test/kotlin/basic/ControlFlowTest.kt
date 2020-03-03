package basic

import org.junit.Test
import kotlin.test.assertEquals

class ControlFlowTest {

    @Test
    fun `verify max`() {
        assertEquals(max, b1)
    }

    @Test
    fun `test next color`() {
        assertEquals(getNextColor(Color.RED), Color.GREEN)
        assertEquals(getNextColor(Color.GREEN), Color.BLUE)
        assertEquals(getNextColor(Color.BLUE), Color.RED)
    }
}
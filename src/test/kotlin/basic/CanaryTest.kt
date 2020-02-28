package basic

import org.junit.Test
import kotlin.test.assertEquals

class CanaryTest {

    @Test
    fun `verify test environment`() {
        assertEquals(4, 2 + 2)
    }
}
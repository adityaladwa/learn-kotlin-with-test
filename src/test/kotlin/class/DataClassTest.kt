package `class`

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class DataClassTest {

    @Test
    fun `check equality`() {
        val person1 = Person("Aditya", 21)
        val person2 = Person("Aditya", 21)

        assertEquals(person1, person2)
        Assert.assertNotSame(person1, person2)
    }
}
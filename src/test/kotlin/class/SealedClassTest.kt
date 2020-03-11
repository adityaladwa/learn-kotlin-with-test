package `class`

import org.junit.Test
import kotlin.test.assertTrue

class SealedClassTest {

    @Test
    fun `Sealed class test`() {
        val expr: Expr = NotANumber

        assertTrue(
            expr is Expr
        )
        assertTrue(
            expr is NotANumber
        )
    }
}
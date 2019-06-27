import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day5KtTest {

    @Test
    fun car() {
        assertEquals(3, car(cons(3,4)))
    }

    @Test
    fun cdr() {
        assertEquals(4, cdr(cons(3,4)))
    }
}
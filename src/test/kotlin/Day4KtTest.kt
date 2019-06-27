import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day4KtTest {

    @Test
    fun missingInteger() {
        val case = intArrayOf(3, 4, -1, 1)
        assertEquals(2, day4missingInteger(case))
    }
}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day2KtTest {

    @Test
    fun case1() {
        val case = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(120, 60, 40, 30, 24)

        assertArrayEquals(expected, day2(case))
        assertArrayEquals(expected, day2WithoutDevision(case))
    }

    @Test
    fun case2() {
        val case = intArrayOf(3, 2, 1)
        val expected = intArrayOf(2, 3, 6)

        assertArrayEquals(expected, day2(case))
        assertArrayEquals(expected, day2WithoutDevision(case))
    }
}
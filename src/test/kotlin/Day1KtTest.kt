import org.junit.jupiter.api.Test

internal class Day1KtTest {
    private val k = 17

    @Test
    fun day1GivenExample() {
        val case = intArrayOf(10, 15, 3, 7)

        assert(day1BruteForce(k, case))
        assert(day1Sorted(k, case))
        assert(day1Hashset(k, case))
    }

    @Test
    fun day1ShouldHandleNegativeNumbers() {
        val case = intArrayOf(10, 15, -3, 7)

        assert(day1BruteForce(k, case))
        assert(day1Sorted(k, case))
        assert(day1Hashset(k, case))
    }

    @Test
    fun day1ShouldHandleEmptyArray() {
        val case = intArrayOf()

        assert(!day1BruteForce(k, case))
        assert(!day1Sorted(k, case))
        assert(!day1Hashset(k, case))
    }

    @Test
    fun day1NoValidSum() {
        val case = intArrayOf(10, 15, 3)

        assert(!day1BruteForce(k, case))
        assert(!day1Sorted(k, case))
        assert(!day1Hashset(k, case))
    }
}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day3KtTest {

    @Test
    fun serialize() {
        val expected = Node("root", Node("left", Node("left.left")), Node("right"))
        val actual = deserialize(serialize(expected))

        assertEquals(expected, actual)
    }
}
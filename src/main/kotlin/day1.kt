import kotlin.system.measureTimeMillis

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */

fun day1BruteForce(k: Int, numbers: IntArray): Boolean {

    for ((i, number) in numbers.withIndex()) {
        for (j in numbers.slice (i+1 until numbers.size)) {
            if (k == number + j) {
                return true
            }
        }
    }
    return false
}

fun day1Sorted(k: Int, numbers: IntArray): Boolean {
    val sortedNumbers = numbers.sorted()

    var start = 0
    var end = sortedNumbers.lastIndex

    while (start < end) {
        val sum = sortedNumbers[start] + sortedNumbers[end]
        when {
            sum == k -> return true
            sum > k -> end--
            sum < k -> start++
        }
    }
    return false
}

fun day1Hashset(target: Int, numbers: IntArray): Boolean {
    var hash = mutableSetOf<Int>()
    for (i in numbers) {
        if (hash.contains(target - i)) {
            return true
        }
        hash.add(i)
    }
    return false
}


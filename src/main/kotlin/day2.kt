/*
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
 */
fun day2(input: IntArray): IntArray {
    val product = input.reduce { acc, i -> acc * i}
    return IntArray(input.size) { i -> product / input[i]}
}

fun day2WithoutDevision(input: IntArray): IntArray {
    var result = IntArray(input.size) { i -> 1}
    for ((index, i) in input.withIndex()) {
        for (j in 0..input.lastIndex) {
            if (index != j) {
                result[j] *= i
            }
        }
    }
    return result
}
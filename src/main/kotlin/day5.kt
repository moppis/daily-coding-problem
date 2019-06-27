/*
This problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

Implement car and cdr.
 */
typealias f = (Int, Int) -> Int
typealias pair = (f) -> Int

val cons: (Int, Int) -> pair = { a, b -> { it(a, b) } }

val cdr: (pair) -> Int = { it { _, b -> b } }

val car: (pair) -> Int = { it { a, _ -> a } }
package org.yagamipaul.hackerrank.algorithms.search

import java.util.*

/**
 * Pairs
 * https://www.hackerrank.com/challenges/pairs
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    var set = mutableSetOf<Long>()

    for (i in 0.until(n)) {
        set.add(scanner.nextLong())
    }

    var sum = 0
    for (e in set) {
        if (set.contains(e + k)) {
            sum++
        }
    }
    println(sum)
}

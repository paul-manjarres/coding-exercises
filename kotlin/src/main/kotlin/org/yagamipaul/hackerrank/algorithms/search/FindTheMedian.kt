package org.yagamipaul.hackerrank.algorithms.search

import java.util.*

/**
 * Find the median
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val c = IntArray(n)

    for (i in 0.until(n)) {
        c[i] = scanner.nextInt()
    }

    Arrays.sort(c)
    println(c[n / 2])
}

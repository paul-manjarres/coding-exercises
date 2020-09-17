package org.yagamipaul.hackerrank.algorithms.search

import java.util.*

/**
 * Minimum Loss
 * https://www.hackerrank.com/challenges/minimum-loss
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val p = LongArray(n)
    val map = mutableMapOf<Long, Int>()
    for (i in 0.until(n)) {
        p[i] = scanner.nextLong()
        map[p[i]] = i
    }

    var sorted = p.sortedArray().reversedArray()

    var min = Long.MAX_VALUE

    for (i in 0 until n - 1) {
        val diff = sorted[i] - sorted[i + 1]
        // if( (diff < min) and ( p.indexOf(sorted[i]) < p.indexOf(sorted[i+1]) )){
        val indexA = map.getOrDefault(sorted[i], -1)
        val indexB = map.getOrDefault(sorted[i + 1], -1)

        if ((diff < min) and (indexA < indexB)) {
            min = diff
        }
        if (min == 1L) {
            break
        }
    }
    println(min)
    scanner.close()
}

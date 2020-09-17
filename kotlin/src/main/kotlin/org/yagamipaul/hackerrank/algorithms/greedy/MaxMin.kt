package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

/**
 * Max Min
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val k = scanner.nextInt()

    val x = IntArray(n)
    for (i in 0.until(n)) {
        x[i] = scanner.nextInt()
    }

    Arrays.sort(x)
//    println(x.contentToString())

    var min = Int.MAX_VALUE

    for (i in 0.until(n - k + 1)) {
//        println("${x[i]} - ${x[i+k-1]}")
        min = Math.min(min, x[i + k - 1] - x[i])
    }

    println(min)
    scanner.close()
}

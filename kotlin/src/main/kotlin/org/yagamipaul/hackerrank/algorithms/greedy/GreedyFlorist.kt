package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

/**
 * Greedy Florist
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */

class GreedyFlorist {

    // Complete the getMinimumCost function below.
    fun getMinimumCost(k: Int, c: Array<Int>): Int {
        val n = c.size
        val div = n / k
        val mod = n % k

        var multiplier = div + 1
        val m = Array<Int>(n) { _ -> 0 }

        for (i in 0 until mod) {
            m[i] = multiplier
        }
        multiplier--
        var count = 0
        for (i in 0 until div * k) {
            m[i + mod] = multiplier
            count++
            if (count >= k) {
                multiplier--
                count = 0
            }
        }
        return c.sorted().mapIndexed { index, i -> i * m[index] }.sum()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val minimumCost = GreedyFlorist().getMinimumCost(k, c)

    println(minimumCost)
}

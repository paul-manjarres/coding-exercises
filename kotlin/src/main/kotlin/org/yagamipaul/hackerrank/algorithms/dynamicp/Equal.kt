package org.yagamipaul.hackerrank.algorithms.dynamicp

import java.util.*

/**
 * Equal
 * https://www.hackerrank.com/challenges/equal/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    for (_i in 0 until t) {
        val n = scanner.nextInt()
        val arr = LongArray(n)
        for (_j in 0 until n) {
            arr[_j] = scanner.nextLong()
        }
        val obj = DynamicPEqual()
        println(obj.solve(arr))
    }
}

class DynamicPEqual {

    /**
     * Solves the problem
     */
    fun solve(arr: LongArray): Long {
        if (arr.size == 1) {
            return 0
        }
        var ops = Long.MAX_VALUE
        arr.sort()

        for(j in 0 until 3) {
            var sum = 0L

            for (i in arr) {
                val delta = i - arr[0]+j
                val ai = delta / 5
                val bi = (delta % 5) / 2
                val ci = ((delta % 5) % 2) / 1
                sum += ai + bi + ci
            }
            ops = Math.min(ops, sum)

        }
        return ops
    }
}


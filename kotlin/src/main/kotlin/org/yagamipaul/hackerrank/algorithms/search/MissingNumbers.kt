package org.yagamipaul.hackerrank.algorithms.search

import java.util.*

/**
 * Missing numbers
 * https://www.hackerrank.com/challenges/minimum-loss
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val a = IntArray(n)
    var freqA = HashMap<Int, Int>()
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
        var count = freqA.getOrDefault(a[i], 0)
        freqA[a[i]] = count + 1
    }

    val m = scanner.nextInt()
    val b = IntArray(m)
    var freqB = HashMap<Int, Int>()
    for (i in 0 until m) {
        b[i] = scanner.nextInt()
        var count = freqB.getOrDefault(b[i], 0)
        freqB[b[i]] = count + 1
    }

    val missingTotal = m - n
    var missing = 0

    val missingValues = TreeSet<Int>()

    for ((key, value) in freqB) {

        val item = freqA.getOrDefault(key, -1)

        if (item == -1) {
            missingValues.add(item)
            missing += (value)
        } else if (item < value) {
            missingValues.add(key)
            missing += (value - item)
        }
        if (missing == missingTotal) {
            break
        }
    }

    missingValues.forEach {
        i ->
        print("$i ")
    }
}

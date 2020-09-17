package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

/**
 * Fraudulent Activity Notifications
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val d = scanner.nextInt()
    val arr = IntArray(n)
    val freq = IntArray(201)

    for (_i in 0 until d) {
        arr[_i] = scanner.nextInt()
        freq[arr[_i]]++
    }
    for (_i in d until n) {
        arr[_i] = scanner.nextInt()
    }

    println(solve(arr, freq, n, d))
    scanner.close()
}

/**
 * Solves the problem, returns the solution
 */
private fun solve(arr: IntArray, freq: IntArray, n: Int, d: Int): Int {

    // if the window size is equals the size of the array.
    if (d == n) {
        return 0
    }

    var notifications = 0

    for (i in d until n) {
        val median = findMedian(freq, d)
        if (arr[i] >= 2 * median) {
            notifications++
        }

        freq[arr[i]]++
        freq[arr[i - d]]--
    }

    return notifications
}

private fun findMedian(freq: IntArray, d: Int): Double {

    var a = 0
    var b = 0
    var j = 0
    val d2 = d / 2
    val isEven = (d % 2 == 0)

    for (i in 0 until freq.size) {
        val temp = j + freq[i]

        if (temp <= d2) {
            j = temp
            if (j == d2) {
                a = i
            }
        } else {
            a = if (j == d2) i - 1 else i
            b = i
            break
        }
    }
    return if (isEven) (a + b) / 2.0 else b.toDouble()
}

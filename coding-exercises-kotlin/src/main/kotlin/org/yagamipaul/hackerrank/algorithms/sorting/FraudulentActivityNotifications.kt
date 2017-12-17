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

    for (_i in 0 until n) {
        arr[_i] = scanner.nextInt()
        if (_i < d) {
            freq[arr[_i]]++
        }
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

    val sortedArray = IntArray(d)
    var j = 0
    val d2 = d / 2

    for (i in 0 until freq.size) {

        if (j + freq[i] <= d2) {
            j += freq[i]
            if(j== d2){
                sortedArray[d2 - 1] = i
            }
        } else {
            sortedArray[d2 - 1] = if(j == d2) i-1 else i
            sortedArray[d2] = i
            break
        }
    }

    return if (d % 2 == 0) (sortedArray[d2 - 1] + sortedArray[d2]) / 2.0 else sortedArray[d2].toDouble()

}

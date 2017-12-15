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

    for (_i in 0 until n) {
        arr[_i] = scanner.nextInt()
    }
    println(solve(arr, n, d))
    scanner.close()
}


private fun solve(arr: IntArray, n: Int, d: Int): Int {

    var notifications = 0

    if(d==n){
        return 0
    }

    val freq = IntArray(201)
    for (i in 0 until d) {
        freq[arr[i]]++
    }

    for( i in d until n){
        var median = findMedian(freq, d)
        if(arr[i] >= 2*median){
            notifications++
        }

        freq[arr[i]]++
        freq[arr[i-d]]--
    }

    return notifications

}

private fun findMedian(freq: IntArray, d: Int): Int {

    val sortedArray = IntArray(d)
    var j = 0

    for (i in 0 until freq.size) {
        if (freq[i] > 0) {
            var k = 0
            while (k < freq[i]) {
                sortedArray[j] = i
                k++
                j++
            }

        }
    }

    val median = if (d % 2 == 0) (sortedArray[d / 2] + sortedArray[d / 2 + 1]) / 2 else sortedArray[d / 2]
    //sortedArray.forEach { print("$it ") }
    //println("median = $median")

    return median
}

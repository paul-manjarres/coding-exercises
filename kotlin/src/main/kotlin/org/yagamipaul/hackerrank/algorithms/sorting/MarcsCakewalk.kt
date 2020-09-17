package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val arr = IntArray(n)
    for (i in 0..n - 1) {
        arr[i] = scanner.nextInt()
    }

    var miles = 0L
    Arrays.sort(arr)
    arr.reverse()

    for (i in 0.until(n)) {
        miles += arr[i] * Math.pow(2.0, i.toDouble()).toLong()
    }
    println(miles)
}

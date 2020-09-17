package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

/**
 * Counting Sort 3
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val arr = IntArray(100)
    for (i in 0 until n) {
        val number = scanner.nextInt()
        var str = scanner.nextLine()
        arr[number]++
    }

    for (i in 0 until arr.size - 1) {
        print("${arr[i]} ")
        arr[i + 1] += arr[i]
    }

    print("${arr[99]}")
}

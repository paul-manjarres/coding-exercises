package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

/**
 * Counting Sort 2
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val arr = IntArray(100)
    for (i in 0 until n) {
        val number = scanner.nextInt()
        arr[number]++
    }

    for (i in 0 until arr.size) {

        if (arr[i] > 0) {
            repeat(
                arr[i],
                {
                    print("$i ")
                }
            )
        }
    }
}

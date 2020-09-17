package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val arr = IntArray(100)
    for (i in 0 until n) {
        val number = scanner.nextInt()
        arr[number]++
    }

    arr.forEach { print("$it ") }
}

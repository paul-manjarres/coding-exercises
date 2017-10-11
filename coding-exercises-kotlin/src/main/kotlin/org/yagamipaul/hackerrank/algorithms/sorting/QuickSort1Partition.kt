package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*
import kotlin.collections.ArrayList

/**
 * Hackerrank
 * Sorting
 * Quicksort 2
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val arr = IntArray(n)
    for (i in 0..n - 1) {
        arr[i] = scanner.nextInt()
    }

    val p = arr[0]
    val left = ArrayList<Int>()
    val equal = ArrayList<Int>()
    val right = ArrayList<Int>()

    arr.forEach { i ->
        when {
            i == p -> equal.add(i)
            i < p -> left.add(i)
            i > p -> right.add(i)
        }
    }

    left.forEach { i -> print("$i ") }
    equal.forEach { i -> print("$i ") }
    right.forEach { i -> print("$i ") }
}
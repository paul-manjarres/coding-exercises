package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

/**
 * QuickSort 3 - Sorting in place
 * https://www.hackerrank.com/challenges/quicksort2/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = sc.nextInt()
    }
    solve(arr, 0, n - 1)
}

/**
 * Solves the problem in place
 */
private fun solve(arr: IntArray, a: Int, b: Int): IntArray {

    // If the array is only 1 element or empty, is already sorted.
    if (a >= b) {
        return arr
    }

    val pivotIndex = findPivotIndex(arr, a, b)
    solve(arr, a, pivotIndex - 1)
    solve(arr, pivotIndex + 1, b)
    return arr
}

/**
 * Finds the pivot in the current subarray
 */
private fun findPivotIndex(arr: IntArray, a: Int, b: Int): Int {
    // println("Find pivot a: $a, b: $b")
    val pivot = arr[b]
    var i = a - 1
    var j = a

    while (j < b) {
        if (arr[j] < pivot) {
            i++
            swap(arr, i, j)
        }
        j++
    }

    // swat the pivot with the index
    swap(arr, a = i + 1, b = b)
    printArray(arr)
    return i + 1
}

/**
 * Swaps elements
 */
private fun swap(arr: IntArray, a: Int, b: Int) {
    val temp = arr[b]
    arr[b] = arr[a]
    arr[a] = temp
}

private fun printArray(arr: IntArray) {
    arr.forEach {
        print("$it ")
    }
    println("")
}

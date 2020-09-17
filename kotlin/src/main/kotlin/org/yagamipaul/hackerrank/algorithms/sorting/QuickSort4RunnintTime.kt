package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*

/**
 * QuickSort 4 - Running time
 * https://www.hackerrank.com/challenges/quicksort4/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */

var quickSortSwaps = 0
var insertionSortSwaps = 0

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = sc.nextInt()
    }
    quickSort(arr.copyOf(), 0, n - 1)
    insertionSort(arr.copyOf())

    println("${insertionSortSwaps - quickSortSwaps}")
}

/**
 * Solves the problem in place
 */
fun quickSort(arr: IntArray, a: Int, b: Int): IntArray {

    // If the array is only 1 element or empty, is already sorted.
    if (a >= b) {
        return arr
    }

    val pivotIndex = findPivotIndex(arr, a, b)
    quickSort(arr, a, pivotIndex - 1)
    quickSort(arr, pivotIndex + 1, b)
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
            quickSortSwaps++
        }
        j++
    }

    // swat the pivot with the index
    swap(arr, a = i + 1, b = b)
    quickSortSwaps++
    // printArray(arr)
    return i + 1
}

private fun insertionSort(arr: IntArray): IntArray {
    for (i in 1 until arr.size) {
        var j = i
        while (j> 0 && arr[j - 1]> arr[j]) {
            swap(arr, j, j - 1)
            insertionSortSwaps++
            j--
        }
    }
    // printArray(arr)
    return arr
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

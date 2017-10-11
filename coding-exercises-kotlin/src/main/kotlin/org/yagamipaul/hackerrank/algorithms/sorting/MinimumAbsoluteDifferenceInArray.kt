package org.yagamipaul.hackerrank.algorithms.sorting


import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val arr = IntArray(n)
    for (i in 0..n - 1) {
        arr[i] = scanner.nextInt()
    }
    Arrays.sort(arr)

    var min = Math.abs(arr[0] - arr[1])
    for( i in 1..n-2){
        min = Math.min(min, Math.abs(arr[i] - arr[i+1]))
    }
    println(min)
}
package org.yagamipaul.hackerrank.algorithms.dynamicp

import java.util.*

/**
 * Equal
 * https://www.hackerrank.com/challenges/equal/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    for (_i in 0 until t) {
        val n = scanner.nextInt()
        val arr = LongArray(n)
        for (_j in 0 until n) {
            arr[_j] = scanner.nextLong()
        }
        println(solve(arr, n))
    }
}

/**
 * Solves the problem
 */
private fun solve(arr: LongArray, n: Int): Long {
    if (arr.size == 1) {
        return 0
    }

    // Sorts the array first
    arr.sort()

    var ops = 0L
    var i = 0
    var j = 1
    var sum = 0L

    while (i < n - 1) {

        //printArr(arr)


        if (arr[i] == arr[j]) {
            println("sum: $sum")
            if (j + 1 < n) {
                arr[j + 1] += sum
            }
            i++
            j++
        } else {
            var diff = arr[j] - arr[i]

            if (diff >= 5) {
                val div = diff / 5
                arr[i] += div * 5
                ops += div
                sum += div * 5
            } else {
                var add = when {
                    (diff >= 3 ) -> 3L
                    else -> 1L
                }
                arr[i] += add
                sum += add
                ops++
            }
        }
    }
    return ops
}


private fun printArr(arr: LongArray){
    arr.forEach{
        i-> print("$i ")
    }
    println("")

}

//1 5 5 

package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

/**
 * https://www.hackerrank.com/challenges/largest-permutation/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
class LargestPermutation {

    // Complete the alternate function below.
    fun solution(k: Int, arr: Array<Int>): Array<Int> {

        val map = mutableMapOf<Int, Int>()

        // Get the index for each element
        for (j in 0.until(arr.size)) {
            map[arr[j]] = j
        }

        // Sort descending to get K elements O(nlogn)
        val sortedList = arr.sortedDescending()

        var count = 0
        // Swap K elements
        for (i in 0.until(arr.size)) {

            if (arr[i] != sortedList[i]) {
                var indexMax = map.getOrDefault(sortedList[i], 0)
                var temp = arr[i]
                arr[i] = sortedList[i]
                arr[indexMax] = temp

                map[sortedList[i]] = i
                map[temp] = indexMax
                count++
            }

            if (count >= k) break
        }
        return arr
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val k = scan.nextInt()
    val x = IntArray(n)
    for (i in 0.until(n)) {
        x[i] = scan.nextInt()
    }
    val result = LargestPermutation().solution(k, x.toTypedArray())
    result.forEach { i -> print("$i ") }
}

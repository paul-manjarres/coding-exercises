package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*


/**
 * https://www.hackerrank.com/challenges/largest-permutation/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
class LargestPermutation {

    // Complete the alternate function below.
    fun solution(k: Int, arr: Array<Int>): Array<Int> {

        val orderedList = mutableListOf<Pair<Int, Int>>();
        val sol = arr.copyOf();

        for(j in 0.until(k)) {
            var maxVal = Pair(0,0);
            for (i in 0.until(arr.size)) {
                if (arr[i] > maxVal.first ) {
                    maxVal = Pair(arr[i], i);
                }
            }
            arr[maxVal.second] = 0;
            orderedList.add(maxVal);
        }

        orderedList.sortedByDescending { it -> it.first }

        for(i in 0.until(k)){
            val higher = orderedList.get(i);
            var temp = sol[i];
            sol[i] = higher.first
            sol[higher.second] = temp;
        }
        return sol;
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
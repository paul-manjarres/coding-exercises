package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*
import kotlin.collections.ArrayList


/**
 * Quicksort 2 - Sorting
 * https://www.hackerrank.com/challenges/quicksort2/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)

    for( i in 0 until n){
        arr[i] = sc.nextInt()
    }
    solve(arr)

}

/**
 * Solves the problem in a recursive way
 */
private fun solve(arr:IntArray): IntArray{

    // If the array is only 1 element or empty, is already sorted.
    if(arr.size == 1 || arr.isEmpty()){
        return arr
    }

    val pivot = arr[0]

    val leftArr = ArrayList<Int>()
    val rightArr = ArrayList<Int>()


    for(i in 1 until arr.size){
        when{
            arr[i] < pivot -> leftArr.add(arr[i])
            arr[i] > pivot -> rightArr.add(arr[i])
        }
    }

   // println("left: ${printArray(leftArr.toIntArray())}")
   // println("Right: ${printArray(rightArr.toIntArray())}")

    val merged = intArrayOf(*solve(leftArr.toIntArray()),pivot,*solve(rightArr.toIntArray()))
    println("${printArray(merged)}")
    return merged

}


private fun printArray(arr: IntArray) : String{
    var str = ""
    for(i in arr){
        str+="$i "
    }
    return str
}
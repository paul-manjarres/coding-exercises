package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*


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
    solve(arr, 0,n-1)

}

/**
 * Solves the problem in place
 */
fun solve(arr:IntArray, a: Int, b:Int): IntArray{

    // If the array is only 1 element or empty, is already sorted.
    if(a>=b){
        return arr
    }

    val pivotIndex = findPivotIndex(arr,a,b)
    solve(arr, a, pivotIndex-1)
    solve(arr, pivotIndex+1, b)
    return arr

}

fun findPivotIndex(arr:IntArray, a: Int, b: Int): Int{

    println("Find pivot a: $a, b: $b")

    val pivot = arr[b]
    var start =a
    var end = b -1

    var swapStart = false
    var swapEnd = false

    while(start < end){

        if(arr[start] > pivot){
            swapStart = true

        }else{
            start++
        }

        if(arr[end] < pivot){
            swapEnd = true

        }else{
            end--
        }

        if(swapStart && swapEnd){
            swap(arr, start, end)
            swapStart = false
            swapEnd = false
            start++
            end--
        }
    }

    //swat the pivot with the index
    swap(arr, start, b)

    println("${printArray(arr)}")
    return start


}

fun swap(arr:IntArray, a:Int, b:Int){
    val temp = arr[b]
    arr[b] = arr[a]
    arr[a] = temp
}

private fun printArray(arr: IntArray) : String{
    var str = ""
    for(i in arr){
        str+="$i "
    }
    return str
}
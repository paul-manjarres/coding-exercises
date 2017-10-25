package org.yagamipaul.hackerrank.algorithms.search

import java.util.*


/**
 * Sherlock and Array
 * https://www.hackerrank.com/challenges/sherlock-and-array
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val t = scanner.nextInt()

    for (_i in 0 until t) {
        val n = scanner.nextInt()
        val a = IntArray(n)
        for (i in 0 until n) {
            a[i] = scanner.nextInt()
        }
        println(solve(a))
    }
    scanner.close()
}


fun solve(a: IntArray): String {

    var min = 0
    var n = a.size
    var max = n
    var result = -1
    var stop = false

    while (!stop) {
        var index = (max + min) / 2
        var left = a.slice(0..index-1).sum()
        var right = a.slice(index+1 .. n).sum()

        if(left < right){
            min = index
        }else if(left > right){
            max = index
        }else{
            result = index
            stop = true
        }

        if((min == max || max-min==1) && result==-1){
            stop = true
        }
    }

    return if(result == -1 ) "NO" else "YES"

}

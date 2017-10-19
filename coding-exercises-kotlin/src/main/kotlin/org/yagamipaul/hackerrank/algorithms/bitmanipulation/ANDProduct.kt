package org.yagamipaul.hackerrank.algorithms.bitmanipulation

import java.util.*


/**
 * And product
 * https://www.hackerrank.com/challenges/and-product
 * Jean Paul Manjarres Correal
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    for(_i in 0 until n){

        val a = scanner.nextLong()
        val b = scanner.nextLong()
        var res: Long = a

        for ( i in (a+1)..b){
            res = res and i
        }
        println(res)
    }
}

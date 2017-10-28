package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*


/**
 * Mark and Toys
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val k = scanner.nextInt()

    val c = IntArray(n)
    for (i in 0.until(n)) {
        c[i] = scanner.nextInt()
    }

    Arrays.sort(c)

    var sum = 0
    var i = 0
    while(sum <= k){
        if(c[i] + sum <= k){
            sum  += c[i]
            i++
        }else{
            break
        }
    }
    println(i)

}
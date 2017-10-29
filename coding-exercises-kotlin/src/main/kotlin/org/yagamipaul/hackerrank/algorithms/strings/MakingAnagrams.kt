package org.yagamipaul.hackerrank.algorithms.strings

import java.util.*


/**
 * Making anagrams
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextLine()
    val b = scanner.nextLine()
    var arrA = IntArray(26)
    var arrB = IntArray(26)

    a.forEach { arrA[it-'a']++ }
    b.forEach { arrB[it-'a']++ }

    var count = 0
    for(i in 0 until 26){
        if( arrA[i] != arrB[i]){
            count += Math.abs(arrA[i] - arrB[i])
        }
    }
    println(count)
}
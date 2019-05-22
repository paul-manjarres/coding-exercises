package org.yagamipaul.hackerrank.algorithms.recursion

import java.util.*


/**
 * Recursive Digit Sum
 * Jean Paul Manjarres Correal
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val n = str.split(" ")[0]
    val k = str.split(" ")[1].toInt()

    var baseSum: Long = 0
    n.forEach {
        baseSum += it - '0'
    }

    println(superDigit((baseSum*k).toString()))
}


fun superDigit(num: String): Int {
    if (num.length == 1) return num.toInt()
    var sum: Long = 0
    for (c in num) {
        sum += c - '0'
    }
    return if (sum.toString().length > 1) superDigit(sum.toString()) else sum.toInt()
}
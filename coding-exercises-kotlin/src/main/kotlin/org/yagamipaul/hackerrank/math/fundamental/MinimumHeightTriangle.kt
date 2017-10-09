package org.yagamipaul.hackerrank.math.fundamental

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val b = scanner.nextInt()
    val a = scanner.nextInt()
    val h = Math.ceil(2 * a / b.toDouble())
    println(h.toInt())
}
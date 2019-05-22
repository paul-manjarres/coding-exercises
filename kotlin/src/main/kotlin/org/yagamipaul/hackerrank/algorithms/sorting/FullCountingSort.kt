package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*
import kotlin.collections.HashMap


/**
 * Full Counting sort
 * https://www.hackerrank.com/challenges/countingsort4/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arrFreq = IntArray(100)
    val half = n / 2

    val mapStr = HashMap<Int, String>()

    for (i in 0 until n) {
        val number = scanner.nextInt()
        var str = scanner.nextLine()

        var res = mapStr.getOrDefault(number, "")
        res += if (i >= half) str.trim() + " " else "- "
        mapStr[number] = res

        arrFreq[number]++
    }

    val sb = StringBuilder()
    for (i in 0 until arrFreq.size) {
        sb.append(mapStr.getOrDefault(i, ""))
    }
    println(sb.toString())
}
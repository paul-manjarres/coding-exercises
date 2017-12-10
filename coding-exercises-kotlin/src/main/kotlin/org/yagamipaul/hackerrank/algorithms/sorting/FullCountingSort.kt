package org.yagamipaul.hackerrank.algorithms.sorting

import java.util.*
import kotlin.collections.ArrayList
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
    val arrStr = Array(half, { _ -> "" })

    val mapDash = HashMap<Int, String>()
    val mapStr = HashMap<Int, String>()



    for (i in 0 until n) {
        val number = scanner.nextInt()
        var str = scanner.nextLine()

        // Only store the half of strings we need
        if (i >= half) {
            arrStr[i - half] = str.trim()

            var res = mapStr.getOrDefault(number, "")
            res+=str.trim()+" "
            mapStr[number] = res

        }

        else{

            var res = mapStr.getOrDefault(number, "")
            res+="- "
            mapStr[number] = res

        }
        arrFreq[number]++
   }

    val sb = StringBuilder()
    for (i in 0 until arrFreq.size) {
        if (arrFreq[i] > 0) {
            val str = mapDash.getOrDefault(i, "")
            sb.append(str)

            val str2 = mapStr.getOrDefault(i, "")
            sb.append(str2)
        }

    }
    println(sb.toString())
}
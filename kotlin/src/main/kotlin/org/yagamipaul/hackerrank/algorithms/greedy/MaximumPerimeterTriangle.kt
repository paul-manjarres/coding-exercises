package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*

/**
 * Maximum perimeter triangle
 * Jean Paul Manjarres Correal
 */
class MaximumPerimeterTriangle {

    // Complete the maximumPerimeterTriangle function below.
    fun maximumPerimeterTriangle(sticks: Array<Int>): Array<String> {

        var response = arrayOf("-1", "", "")

        val sorted = sticks.sortedArray()
        var i = sorted.size - 3

        while (i >= 0) {
            if (sorted[i] + sorted[i + 1] > sorted[i + 2]) {
                response[0] = sorted[i].toString()
                response[1] = sorted[i + 1].toString()
                response[2] = sorted[i + 2].toString()
                return response
            }
            i--
        }
        return response
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val sticks = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = MaximumPerimeterTriangle().maximumPerimeterTriangle(sticks)
    println(result.joinToString(" "))
}

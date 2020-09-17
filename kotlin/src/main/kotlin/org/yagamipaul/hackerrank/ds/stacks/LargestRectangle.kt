package org.yagamipaul.hackerrank.ds.stacks

import java.util.*

class LargestRectangle {

    // Complete the largestRectangle function below.
    fun largestRectangle(h: Array<Int>): Long {

        return 9
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val h = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = LargestRectangle().largestRectangle(h)

    println(result)
}

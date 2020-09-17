package org.yagamipaul.hackerrank.algorithms.implementation

import java.util.*

class LisasWorkBook {

    // Complete the workbook function below.
    fun workbook(n: Int, k: Int, arr: Array<Int>): Int {

        var page = 0
        var special = 0

        // Iterate over chapters, i = chapter
        for (i in 0 until n) {
            page++
            var pageInChapter = 1

            // Iterate over problems inside chapter
            for (j in 1 until arr[i] + 1) {
                if (j / k.toDouble() > pageInChapter) {
                    pageInChapter++
                    page++
                }
                if (j == page) {
                    special++
                }
            }
        }
        return special
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = LisasWorkBook().workbook(n, k, arr)

    println(result)
}

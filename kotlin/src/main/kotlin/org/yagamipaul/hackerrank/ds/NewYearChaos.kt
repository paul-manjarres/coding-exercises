package org.yagamipaul.hackerrank.ds

import java.util.*


// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {



}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}

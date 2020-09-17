package org.yagamipaul.hackerrank.algorithms.gametheory

import java.util.*

class TowerBreakers {

    // Complete the towerBreakers function below.
    fun towerBreakers(n: Int, m: Int): Int {

        if (m == 1 || n % 2 == 0) {
            return 2
        }

        return 1
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nm = scan.nextLine().split(" ")

        val n = nm[0].trim().toInt()

        val m = nm[1].trim().toInt()

        val result = TowerBreakers().towerBreakers(n, m)

        println(result)
    }
}

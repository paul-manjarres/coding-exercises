package org.yagamipaul.hackerrank.algorithms.implementation

import java.util.*

class HalloweenSale {

    // Complete the howManyGames function below.
    fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
        // Return the number of games you can buy

        var count = 0
        var dollars = s

        while (dollars >= 0) {
            var price = p - d * count
            price = if (price > m) price else m
            dollars -= price
            count++
        }
        return if (dollars < 0) --count else count
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val pdms = scan.nextLine().split(" ")

    val p = pdms[0].trim().toInt()

    val d = pdms[1].trim().toInt()

    val m = pdms[2].trim().toInt()

    val s = pdms[3].trim().toInt()

    val answer = HalloweenSale().howManyGames(p, d, m, s)

    println(answer)
}

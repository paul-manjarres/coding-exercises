package org.yagamipaul.hackerrank.algorithms.gametheory

import java.util.*

class GameOfStones {

    // Complete the gameOfStones function below.
    fun gameOfStones(n: Int): String {
        return if (n % 7 == 0 || n % 7 == 1) "Second" else "First"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()
        val result = GameOfStones().gameOfStones(n)
        println(result)
    }
}

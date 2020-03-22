package org.yagamipaul.hackerrank.algorithms.gametheory

import java.util.*
import kotlin.math.abs

/**
 * https://www.hackerrank.com/challenges/nimble-game-1/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
class NimbleGame {

    // Complete the nimbleGame function below.
    fun nimbleGame(s: Array<Int>): String {
        var sum = 0L;
        s[0] = 0;
        s.forEach { i -> sum += i }
        return if (sum % 2 == 1L) return "First" else "Second";
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val s = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = NimbleGame().nimbleGame(s)

        println(result)
    }
}

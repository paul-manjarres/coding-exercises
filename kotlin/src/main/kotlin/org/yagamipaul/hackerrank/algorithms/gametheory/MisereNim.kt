package org.yagamipaul.hackerrank.algorithms.gametheory

import java.util.*

class MisereNim {

    // Complete the misereNim function below.
    fun misereNim(s: Array<Int>): String {

        // check if all the piles are of size 1, in this case the strategy is different
        var allOnes = true
        for (i in s) {
            if (i != 1) {
                allOnes = false
                break
            }
        }

        if (allOnes) {
            return if (s.size % 2 == 0) "First" else "Second"
        }

        // If not, the base case applies to misere nim
        var sum = s[0]
        for (i in 1.until(s.size)) {
            sum = sum.xor(s[i])
        }
        return if (sum == 0) "Second" else "First"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val s = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = MisereNim().misereNim(s)

        println(result)
    }
}

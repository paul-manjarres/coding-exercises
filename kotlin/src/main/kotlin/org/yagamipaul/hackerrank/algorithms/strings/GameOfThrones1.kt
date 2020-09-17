package org.yagamipaul.hackerrank.algorithms.strings

import java.util.*

class GameOfThrones1 {

    // Complete the gameOfThrones function below.
    fun gameOfThrones(s: String): String {

        var arr = IntArray(26)
        s.forEach { arr[it - 'a']++ }
        var hasOdd = false

        for (i in arr) {
            val mod = i % 2
            if (hasOdd && mod == 1) {
                return "NO"
            }
            if (!hasOdd && mod == 1) {
                hasOdd = true
            } else if (mod != 0) {
                return "NO"
            }
        }

        return "YES"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = GameOfThrones1().gameOfThrones(s)

    println(result)
}

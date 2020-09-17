package org.yagamipaul.hackerrank.algorithms.implementation

import java.util.*

class AppendAndDelete {
    // Complete the appendAndDelete function below.
    fun appendAndDelete(s: String, t: String, k: Int): String {
        var count = 0
        for (i in 0.until(Math.min(s.length, t.length))) {
            if (s[i] == t[i]) {
                count++
            } else {
                break
            }
        }

        // calculate the number of different chars in both strings
        var diff = s.length + t.length - (2 * count)

        return if (diff> k) "No"
        else if (count == 0 || diff == k) "Yes"
        else if ((k - diff) % 2 == 0) "Yes"
        else if (k > diff + 2 * count) "Yes"
        else "No"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val t = scan.nextLine()
    val k = scan.nextLine().trim().toInt()
    val result = AppendAndDelete().appendAndDelete(s, t, k)
    println(result)
}

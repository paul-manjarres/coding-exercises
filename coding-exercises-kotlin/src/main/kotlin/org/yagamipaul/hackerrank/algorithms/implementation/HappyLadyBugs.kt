package org.yagamipaul.hackerrank.algorithms.implementation

import java.util.*

class HappyLadyBugs {


    // Complete the happyLadybugs function below.
    fun happyLadybugs(b: String): String {

        var spaces = 0
        var count = IntArray(26)

        // Count the number of letters and spaces
        for (c in b) {
            if (c == '_') {
                spaces++
            } else {
                count[c - 'A']++
            }
        }

        var isPossible = true

        // Count if the number of ladybugs make it possible to solve
        for (i in count) {
            if (i == 1) {
                isPossible = false
                break
            }
        }

        if(!isPossible) {
            return "NO"
        }

        if (spaces == 0 ) {
            //If there are no spaces, we have to check if the ladybugs are already happy
           for (i in 1.until(b.length - 1)) {
                if (b[i] != b[i - 1] && b[i] != b[i + 1]) {
                    return "NO"
                }
            }
        }

        return "YES"
    }


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val n = scan.nextLine().trim().toInt()

        val b = scan.nextLine()

        val result = HappyLadyBugs().happyLadybugs(b)

        println(result)
    }
}
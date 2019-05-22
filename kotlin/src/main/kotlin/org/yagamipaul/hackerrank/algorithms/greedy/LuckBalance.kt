package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*
import kotlin.collections.ArrayList

/**
 * Luck Balance
 * Jean Paul Manjarres Correal
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val k = scanner.nextInt()

    var luckBalance = 0
    var lost = 0
    val listL = ArrayList<Int>()

    for (i in 0.until(n)) {
        val l = scanner.nextInt()
        val t = scanner.nextInt()

        if (t == 0) {
            luckBalance += l
        } else {
            listL.add(l)
        }
    }
    scanner.close()

    Collections.sort(listL)
    listL.reverse()

    for (i in 0.until(listL.size)) {
        if (lost < k) {
            luckBalance += listL[i]
            lost++
        } else{
            luckBalance -= listL[i]
        }

    }

    print(luckBalance)


}
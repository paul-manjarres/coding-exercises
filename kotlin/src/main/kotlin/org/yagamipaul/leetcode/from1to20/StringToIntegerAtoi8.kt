package org.yagamipaul.leetcode.from1to20

import kotlin.math.pow

class StringToIntegerAtoi8 {

    fun myAtoi(str: String): Int {
        var str2 = str.trim()
        if (str2.isEmpty() || str2[0].isLetter()) {
            return 0
        }
        val nums = hashMapOf(
            Pair('1', 1),
            Pair('2', 2),
            Pair('3', 3),
            Pair('4', 4),
            Pair('5', 5),
            Pair('6', 6),
            Pair('7', 7),
            Pair('8', 8),
            Pair('9', 9),
            Pair('0', 0)
        )

        var minus = false
        if (str2[0] == '-' || str2[0] == '+') {
            minus = (str2[0] == '-')
            str2 = str2.drop(1)
        }

        val rev = str2.reversed()
        var sum = 0
        var pow = 0

        for (i in 0 until rev.length) {
            if (rev[i].isDigit()) {
                val toAdd = (nums[rev[i]] ?: 0) * (10.toDouble().pow(pow).toInt())

                if (Int.MAX_VALUE - sum < toAdd || pow > 9) {
                    return if (minus) Int.MIN_VALUE else Int.MAX_VALUE
                }
                sum += toAdd
                pow++
            } else {
                pow = 0
                sum = 0
            }
        }
        return if (minus) sum * (-1) else sum
    }
}

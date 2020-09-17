package org.yagamipaul.leetcode.from1to20

class PalindromeNumber9 {

    fun isPalindrome(x: Int): Boolean {
        if (x <0) return false

        var div = x / 10
        var mod = x % 10
        var reversed = 0

        while (div > 0) {
            reversed = (reversed + mod) * 10
            mod = div % 10
            div /= 10
        }
        reversed += mod

        return reversed == x
    }
}

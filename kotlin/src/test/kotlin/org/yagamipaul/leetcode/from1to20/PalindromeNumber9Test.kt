package org.yagamipaul.leetcode.from1to20

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PalindromeNumber9Test {

    @Test
    fun `Test cases`() {
        var obj = PalindromeNumber9()
        Assertions.assertThat(obj.isPalindrome(121)).isTrue()
        Assertions.assertThat(obj.isPalindrome(-121)).isFalse()
        Assertions.assertThat(obj.isPalindrome(10)).isFalse()
        Assertions.assertThat(obj.isPalindrome(1345431)).isTrue()
    }
}

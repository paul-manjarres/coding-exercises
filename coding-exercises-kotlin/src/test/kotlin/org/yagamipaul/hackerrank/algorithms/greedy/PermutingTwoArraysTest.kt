package org.yagamipaul.hackerrank.algorithms.greedy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class PermutingTwoArraysTest {

    @Test
    fun `test case 1`() {
        val res = PermutingTwoArrays().twoArrays(10, arrayOf(2, 1, 3), arrayOf(7, 8, 9))
        Assertions.assertThat(res).isEqualTo("YES")
    }

    @Test
    fun `test case 2`() {
        val res = PermutingTwoArrays().twoArrays(5, arrayOf(1, 2, 2, 1), arrayOf(3, 3, 3, 4))
        Assertions.assertThat(res).isEqualTo("NO")
    }


}
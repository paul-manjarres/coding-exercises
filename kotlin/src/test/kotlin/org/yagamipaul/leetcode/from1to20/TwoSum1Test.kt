package org.yagamipaul.leetcode.from1to20

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class TwoSum1Test {

    @Test
    fun `Example test case`() {
        val obj = TwoSum1()
        var arr = intArrayOf(2, 7, 11, 15)
        val solution = obj.twoSum(arr, 9)
        Assertions.assertThat(
            Arrays.equals(solution, intArrayOf(0, 1))
        )
            .isTrue()
    }
}

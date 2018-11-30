package org.yagamipaul.hackerrank.ds.stacks

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class LargestRectangleTest {

    @Test
    fun `test case 1`() {
        val res = LargestRectangle().largestRectangle(arrayOf(1,2,3,4,5))
        Assertions.assertThat(res).isEqualTo(9)
    }
}
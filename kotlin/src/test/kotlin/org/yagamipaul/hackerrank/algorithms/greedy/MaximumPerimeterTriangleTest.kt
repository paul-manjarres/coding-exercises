package org.yagamipaul.hackerrank.algorithms.greedy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class MaximumPerimeterTriangleTest {

    @Test
    fun `test case 1`() {
        val res = MaximumPerimeterTriangle().maximumPerimeterTriangle(arrayOf(1, 1, 1, 3, 3))
        Assertions.assertThat(Arrays.equals(res, arrayOf("1", "3", "3"))).isTrue()
    }

    @Test
    fun `test case 2`() {
        val res = MaximumPerimeterTriangle().maximumPerimeterTriangle(arrayOf(1, 1, 1, 2, 3, 5))
        Assertions.assertThat(Arrays.equals(res, arrayOf("1", "1", "1"))).isTrue()
    }
}

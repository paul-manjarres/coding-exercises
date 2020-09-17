package org.yagamipaul.hackerrank.algorithms.dynamicp

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test class for the equals problem.
 *
 */
class EqualTest {

    @Test
    fun `Example test case`() {
        val o = DynamicPEqual()
        val arr = longArrayOf(2, 2, 3, 7)
        val res = o.solve(arr)
        Assertions.assertThat(res).isEqualTo(2)
    }

    @Test
    fun `Sample 1 test case`() {
        val o = DynamicPEqual()
        val arr = longArrayOf(10, 7, 2)
        val res = o.solve(arr)
        Assertions.assertThat(res).isEqualTo(4)
    }

    @Test
    fun `Trivial test case`() {
        val o = DynamicPEqual()
        val arr = longArrayOf(1)
        val res = o.solve(arr)
        Assertions.assertThat(res).isEqualTo(0)
    }

    @Test
    fun `Special test case`() {
        val o = DynamicPEqual()
        val arr = longArrayOf(1, 5, 5)
        val res = o.solve(arr)
        Assertions.assertThat(res).isEqualTo(3)
    }
}

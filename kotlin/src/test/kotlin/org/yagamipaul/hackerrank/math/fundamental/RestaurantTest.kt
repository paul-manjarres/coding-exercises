package org.yagamipaul.hackerrank.math.fundamental

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class RestaurantTest {

    @Test
    fun `test case 1`() {
        val res = Restaurant().restaurant(2, 2)
        Assertions.assertThat(res).isEqualTo(1)
    }

    @Test
    fun `test case 2`() {
        val res = Restaurant().restaurant(6, 9)
        Assertions.assertThat(res).isEqualTo(6)
    }

    @Test
    fun `test case 3`() {
        val res = Restaurant().restaurant(3, 2)
        Assertions.assertThat(res).isEqualTo(6)
    }

    @Test
    fun `test case 4`() {
        val res = Restaurant().restaurant(4, 2)
        Assertions.assertThat(res).isEqualTo(2)
    }
}

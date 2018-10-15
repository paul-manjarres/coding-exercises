package org.yagamipaul.hackerrank.algorithms.implementation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class HalloweenSaleTest {

    @Test
    fun `test case 1`() {
        val res = HalloweenSale().howManyGames(20, 3, 6, 80)
        Assertions.assertThat(res).isEqualTo(6)
    }

    @Test
    fun `test case 2`() {
        val res = HalloweenSale().howManyGames(20, 3, 6, 85)
        Assertions.assertThat(res).isEqualTo(7)
    }

}
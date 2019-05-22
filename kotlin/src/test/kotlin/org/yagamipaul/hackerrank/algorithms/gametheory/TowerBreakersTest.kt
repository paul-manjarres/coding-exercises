package org.yagamipaul.hackerrank.algorithms.gametheory

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TowerBreakersTest {


    @Test
    fun `test case 1`() {
        val res = TowerBreakers().towerBreakers(2,2)
        Assertions.assertThat(res).isEqualTo(2)
    }

    @Test
    fun `test case 2`() {
        val res = TowerBreakers().towerBreakers(1,4)
        Assertions.assertThat(res).isEqualTo(1)
    }
}
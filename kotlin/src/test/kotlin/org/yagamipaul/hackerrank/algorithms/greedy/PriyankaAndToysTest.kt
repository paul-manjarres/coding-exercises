package org.yagamipaul.hackerrank.algorithms.greedy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class PriyankaAndToysTest {

    @Test
    fun `test case 1`() {
        val res = PriyankaAndToys().toys(arrayOf(1,2,3,4,5,10,11,12,13))
        Assertions.assertThat(res).isEqualTo(2)
    }

    @Test
    fun `test case 2`() {
        val res = PriyankaAndToys().toys(arrayOf(1,2,3,21,7,12,14,21))
        Assertions.assertThat(res).isEqualTo(4)
    }

}
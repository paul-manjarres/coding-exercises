package org.yagamipaul.hackerrank.algorithms.greedy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class GreedyFloristTest{

    @Test
    fun `test case 1`(){
        val res = GreedyFlorist().getMinimumCost(3, arrayOf(2,5,6))
        Assertions.assertThat(res).isEqualTo(13)
    }

    @Test
    fun `test case 2`(){
        val res = GreedyFlorist().getMinimumCost(2, arrayOf(2,5,6))
        Assertions.assertThat(res).isEqualTo(15)
    }

    @Test
    fun `test case 3`(){
        val res = GreedyFlorist().getMinimumCost(3, arrayOf(1,3,5,7,9))
        Assertions.assertThat(res).isEqualTo(29)
    }

    @Test
    fun `test case 4`(){
        val res = GreedyFlorist().getMinimumCost(3, arrayOf(6,5,2))
        Assertions.assertThat(res).isEqualTo(13)
    }

    @Test
    fun `test case 5`(){
        val res = GreedyFlorist().getMinimumCost(3, arrayOf(9,7,5,3,1))
        Assertions.assertThat(res).isEqualTo(29)
    }

}
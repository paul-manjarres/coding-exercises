package org.yagamipaul.hackerrank.math.fundamental

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


internal class BestDivisorTest{

    @Test
    fun `test case 1`() {
        val res = BestDivisor().solution(12)
        Assertions.assertThat(res).isEqualTo(6)
    }

    @Test
    fun `test case 2`() {
        val res = BestDivisor().solution(9)
        Assertions.assertThat(res).isEqualTo(9)
    }

    @Test
    fun `test case 3`() {
        val res = BestDivisor().solution(100)
        Assertions.assertThat(res).isEqualTo(25)
    }

    @Test
    fun `test case 4`() {
        val res = BestDivisor().solution(1008)
        Assertions.assertThat(res).isEqualTo(168)
    }

    @Test
    fun `test calculateSum`() {
        val res = BestDivisor().calculateDigitsSum(234)
        Assertions.assertThat(res).isEqualTo(9);
    }



}
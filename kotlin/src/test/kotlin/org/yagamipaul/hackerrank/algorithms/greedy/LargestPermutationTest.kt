package org.yagamipaul.hackerrank.algorithms.greedy


import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class LargestPermutationTest{

    @Test
    fun `Test Case 1`(){
        val res = LargestPermutation().solution(1, arrayOf(4,2,3,5,1));
        Assertions.assertThat(Arrays.equals(res, arrayOf(5, 2, 3, 4, 1))).isTrue();
    }

    @Test
    fun `Test Case 2`(){
        val res = LargestPermutation().solution(1, arrayOf(2,1,3));
        Assertions.assertThat(res.contentEquals(arrayOf(3,1,2)))
    }

    @Test
    fun `Test Case 3`(){
        val res = LargestPermutation().solution(1, arrayOf(2,1));
        Assertions.assertThat(res.contentEquals(arrayOf(2,1)))
    }


}
package org.yagamipaul.hackerrank.algorithms.dynamicp

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger

internal class FibonacciModifiedTest{

    @Test
    fun `Test Case 1`(){
        val res = FibonacciModified().fibonacciModified(0,1,5)
        Assertions.assertThat(res).isEqualTo(5)
    }

    @Test
    fun `Test Case 2`(){
        val res = FibonacciModified().fibonacciModified(1,3,6)
        Assertions.assertThat(res).isEqualTo(112_763_264)
    }

    @Test
    fun `Test Case 3`(){
        val res = FibonacciModified().fibonacciModified(1,3,5)
        Assertions.assertThat(res).isEqualTo(10_619)
    }

    @Test
    fun `Test Case 4`(){
        val res = FibonacciModified().fibonacciModified(0,1,10)
        Assertions.assertThat(res).isEqualTo(BigInteger( "84266613096281243382112"));
    }


}
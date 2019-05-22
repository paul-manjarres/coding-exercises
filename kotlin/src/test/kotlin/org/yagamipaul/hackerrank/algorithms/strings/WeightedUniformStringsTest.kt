package org.yagamipaul.hackerrank.algorithms.strings

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class WeightedUniformStringsTest {


    @Test
    fun `test case 1`() {
        val res = WeightedUniformStrings().weightedUniformStrings("aaabbbbcccddd", arrayOf(9,7,8,12,5))
        Assertions.assertThat(res[0]).isEqualTo("Yes")
        Assertions.assertThat(res[1]).isEqualTo("No")
        Assertions.assertThat(res[2]).isEqualTo("Yes")
        Assertions.assertThat(res[3]).isEqualTo("Yes")
        Assertions.assertThat(res[4]).isEqualTo("No")
    }

    @Test
    fun `test case 2`() {
        val res = WeightedUniformStrings().weightedUniformStrings("abccddde", arrayOf(1,3,12,5,9,10))
        Assertions.assertThat(res[0]).isEqualTo("Yes")
        Assertions.assertThat(res[1]).isEqualTo("Yes")
        Assertions.assertThat(res[2]).isEqualTo("Yes")
        Assertions.assertThat(res[3]).isEqualTo("Yes")
        Assertions.assertThat(res[4]).isEqualTo("No")
        Assertions.assertThat(res[5]).isEqualTo("No")
    }


}
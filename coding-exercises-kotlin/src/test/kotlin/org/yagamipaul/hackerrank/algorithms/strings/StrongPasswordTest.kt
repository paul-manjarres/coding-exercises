package org.yagamipaul.hackerrank.algorithms.strings

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class StrongPasswordTest {

    @Test
    fun `test case 1`() {
        val res = StrongPassword().minimumNumber(3,"Ab1")
        Assertions.assertThat(res).isEqualTo(3)
    }

    @Test
    fun `test case 2`() {
        val res = StrongPassword().minimumNumber(11,"#HackerRank")
        Assertions.assertThat(res).isEqualTo(1)
    }

}
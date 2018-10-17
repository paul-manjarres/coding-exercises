package org.yagamipaul.hackerrank.algorithms.strings

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class GameOfThrones1Test {


    @Test
    fun `test case 1`() {
        val res = GameOfThrones1().gameOfThrones("aaabbbb")
        Assertions.assertThat(res).isEqualTo("YES")
    }

    @Test
    fun `test case 2`() {
        val res = GameOfThrones1().gameOfThrones("cdefghmnopqrstuvw")
        Assertions.assertThat(res).isEqualTo("NO")
    }

    @Test
    fun `test case 3`() {
        val res = GameOfThrones1().gameOfThrones("cdcdcdcdeeeef")
        Assertions.assertThat(res).isEqualTo("YES")
    }


}
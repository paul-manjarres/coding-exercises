package org.yagamipaul.hackerrank.algorithms.implementation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AppendAndDeleteTest {

    @Test
    fun `test case 1`() {
        val res = AppendAndDelete().appendAndDelete("hackerhappy", "hackerrank", 9)
        Assertions.assertThat(res).isEqualTo("Yes")
    }

    @Test
    fun `test case 2`() {
        val res = AppendAndDelete().appendAndDelete("aba", "aba", 7)
        Assertions.assertThat(res).isEqualTo("Yes")
    }

    @Test
    fun `test case 2a`() {
        val res = AppendAndDelete().appendAndDelete("aaaaaaaaaa", "aaaaa", 7)
        Assertions.assertThat(res).isEqualTo("Yes")
    }

    @Test
    fun `test case 3`() {
        val res = AppendAndDelete().appendAndDelete("ashley", "ash", 2)
        Assertions.assertThat(res).isEqualTo("No")
    }

    @Test
    fun `test case 5`() {
        val res = AppendAndDelete().appendAndDelete("y", "yu", 2)
        Assertions.assertThat(res).isEqualTo("No")
    }

    @Test
    fun `test case 9`() {
        val res = AppendAndDelete().appendAndDelete("abcdef", "fedcba", 15)
        Assertions.assertThat(res).isEqualTo("Yes")
    }

    @Test
    fun `test case 10`() {
        val res = AppendAndDelete().appendAndDelete("abcd", "abcdert", 10)
        Assertions.assertThat(res).isEqualTo("No")
    }

    @Test
    fun `test case 12`() {
        val res = AppendAndDelete().appendAndDelete("aaa", "a", 5)
        Assertions.assertThat(res).isEqualTo("Yes")
    }
}

package org.yagamipaul.hackerrank.algorithms.strings

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class TwoCharactersTest{

    @Test
    fun `test case 1`() {
        val res = TwoCharacters().alternate("beabeefeab")
        Assertions.assertThat(res).isEqualTo(5)
    }

    @Test
    fun `test case 2`() {
        val res = TwoCharacters().alternate("abaacdabd")
        Assertions.assertThat(res).isEqualTo(4)
    }

    @Test
    fun `test validate method`() {
        val res = TwoCharacters().validate("babab")
        Assertions.assertThat(res).isEqualTo(true)
    }

    @Test
    fun `test validate method 2`() {
        val res = TwoCharacters().validate("aaaa")
        Assertions.assertThat(res).isEqualTo(false)
    }

    @Test
    fun `test case 4`() {
        val res = TwoCharacters().alternate("asvkugfiugsalddlasguifgukvsa")
        Assertions.assertThat(res).isEqualTo(0)
    }

    @Test
    fun `test case 6`() {
        val res = TwoCharacters().alternate("asdcbsdcagfsdbgdfanfghbsfdab")
        Assertions.assertThat(res).isEqualTo(8)
    }

    @Test
    fun `test case 5`() {
        val res = TwoCharacters().alternate("a")
        Assertions.assertThat(res).isEqualTo(0)
    }
}
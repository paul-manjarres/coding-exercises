package org.yagamipaul.hackerrank.algorithms.strings

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TwoCharactersTest {

    @Test
    @Disabled
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
    fun `test validate method 3`() {
        val res = TwoCharacters().validate("a")
        Assertions.assertThat(res).isEqualTo(false)
    }

    @Test
    fun `test validate method 4`() {
        val res = TwoCharacters().validate("")
        Assertions.assertThat(res).isEqualTo(false)
    }

    @Test
    fun `test validate method 5`() {
        val res = TwoCharacters().validate("eoeoeoeoeoeoeoeoeoeoeoeoeoeo")
        Assertions.assertThat(res).isEqualTo(true)
    }

    @Test
    fun `test permutations 1`() {
        val res = TwoCharacters().createPermutations("abcd")
        println(res)
        Assertions.assertThat(res.size).isEqualTo(6)
    }

    @Test
    fun `test permutations 2`() {
        val res = TwoCharacters().createPermutations("abcdbbbbcccaaaaadddddd")
        println(res)
        Assertions.assertThat(res.size).isEqualTo(6)
    }
    @Test
    fun `test permutations 3`() {
        val res = TwoCharacters().createPermutations("aa")
        println(res)
        Assertions.assertThat(res.size).isEqualTo(0)
    }
}

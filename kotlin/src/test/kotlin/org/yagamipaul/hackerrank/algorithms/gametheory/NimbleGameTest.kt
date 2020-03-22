package org.yagamipaul.hackerrank.algorithms.gametheory

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NimbleGameTest {

    @Test
    fun `First case`() {
        val res = NimbleGame().nimbleGame(arrayOf(0,0,0,0))
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `Second case`() {
        val res = NimbleGame().nimbleGame(arrayOf(0,2,3,0,6))
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `Third case`() {
        val res = NimbleGame().nimbleGame(arrayOf(0,0,0,0))
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `Forth case`() {
        val res = NimbleGame().nimbleGame(arrayOf(1000000000,1000000000,1000000000,1000000000,1000000000))
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `Fifth case`() {
        val res = NimbleGame().nimbleGame(arrayOf(225,441,775))
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `Sixth case`() {
        val res = NimbleGame().nimbleGame(arrayOf( 826, 571, 236, 413, 212, 921, 948, 859, 985, 837))
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `Seventh case`() {
        val res = NimbleGame().nimbleGame(arrayOf(1,1,1,1))
        Assertions.assertThat(res).isEqualTo("First")
    }




}
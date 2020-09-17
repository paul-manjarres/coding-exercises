package org.yagamipaul.hackerrank.algorithms.gametheory

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NimbleGameTest {

    @Test
    fun `First case`() {
        val res = NimbleGame().nimbleGame(arrayOf(0, 0, 0, 0))
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `Second case`() {
        val res = NimbleGame().nimbleGame(arrayOf(0, 2, 3, 0, 6))
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `Third case`() {
        val res = NimbleGame().nimbleGame(arrayOf(0, 0, 0, 0))
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `Forth case`() {
        val res = NimbleGame().nimbleGame(arrayOf(1000000000, 1000000000, 1000000000, 1000000000, 1000000000))
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `Seventh case`() {
        val res = NimbleGame().nimbleGame(arrayOf(1, 1, 1, 1))
        Assertions.assertThat(res).isEqualTo("First")
    }
}

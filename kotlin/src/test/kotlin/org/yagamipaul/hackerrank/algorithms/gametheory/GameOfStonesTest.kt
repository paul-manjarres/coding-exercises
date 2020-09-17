package org.yagamipaul.hackerrank.algorithms.gametheory

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class GameOfStonesTest {

    @Test
    fun `test case 1`() {
        val res = GameOfStones().gameOfStones(1)
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `test case 2`() {
        val res = GameOfStones().gameOfStones(2)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 3`() {
        val res = GameOfStones().gameOfStones(3)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 4`() {
        val res = GameOfStones().gameOfStones(4)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 7`() {
        val res = GameOfStones().gameOfStones(7)
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `test case 8`() {
        val res = GameOfStones().gameOfStones(10)
        Assertions.assertThat(res).isEqualTo("First")
    }
}

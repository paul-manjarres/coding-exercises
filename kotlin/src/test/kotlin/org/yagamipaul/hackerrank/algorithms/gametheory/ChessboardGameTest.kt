package org.yagamipaul.hackerrank.algorithms.gametheory

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ChessboardGameTest {

    @Test
    fun `test case 1`() {
        val res = ChessboardGame().chessboardGame(5, 2)
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `test case 2`() {
        val res = ChessboardGame().chessboardGame(5, 3)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 3`() {
        val res = ChessboardGame().chessboardGame(8, 8)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 4`() {
        val res = ChessboardGame().chessboardGame(1, 5)
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `test case 5`() {
        val res = ChessboardGame().chessboardGame(1, 6)
        Assertions.assertThat(res).isEqualTo("Second")
    }

    @Test
    fun `test case 6`() {
        val res = ChessboardGame().chessboardGame(1, 15)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 7`() {
        val res = ChessboardGame().chessboardGame(4, 15)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 8`() {
        val res = ChessboardGame().chessboardGame(2, 3)
        Assertions.assertThat(res).isEqualTo("First")
    }

    @Test
    fun `test case 9`() {
        val res = ChessboardGame().chessboardGame(2, 4)
        Assertions.assertThat(res).isEqualTo("First")
    }
}

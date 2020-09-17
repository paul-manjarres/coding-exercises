package org.yagamipaul.hackerrank.algorithms.search

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ConnectedCellsInAGridTest {

    @Test
    fun `test case 1`() {
        val res = ConnectedCellsInAGrid().connectedCell(
            arrayOf(
                arrayOf(1, 1, 0, 0),
                arrayOf(0, 1, 1, 0),
                arrayOf(0, 0, 1, 0),
                arrayOf(1, 0, 0, 0)
            )
        )
        Assertions.assertThat(res).isEqualTo(5)
    }

    @Test
    fun `test case 2`() {
        val res = ConnectedCellsInAGrid().connectedCell(
            arrayOf(
                arrayOf(1, 1, 0),
                arrayOf(1, 0, 0),
                arrayOf(0, 0, 1)
            )
        )
        Assertions.assertThat(res).isEqualTo(3)
    }

    @Test
    fun `test case 3`() {
        val res = ConnectedCellsInAGrid().connectedCell(
            arrayOf(
                arrayOf(1, 1, 1, 1)
            )
        )
        Assertions.assertThat(res).isEqualTo(4)
    }

    @Test
    fun `test case 4`() {
        val res = ConnectedCellsInAGrid().connectedCell(
            arrayOf(
                arrayOf(1),
                arrayOf(1),
                arrayOf(1),
                arrayOf(1)
            )
        )
        Assertions.assertThat(res).isEqualTo(4)
    }

    @Test
    fun `test case 5`() {
        val res = ConnectedCellsInAGrid().connectedCell(
            arrayOf(
                arrayOf(1, 0, 0),
                arrayOf(0, 1, 0),
                arrayOf(0, 0, 1)
            )
        )
        Assertions.assertThat(res).isEqualTo(3)
    }

    @Test
    fun `test case 6`() {
        val res = ConnectedCellsInAGrid().connectedCell(
            arrayOf(
                arrayOf(1)
            )
        )
        Assertions.assertThat(res).isEqualTo(1)
    }
}

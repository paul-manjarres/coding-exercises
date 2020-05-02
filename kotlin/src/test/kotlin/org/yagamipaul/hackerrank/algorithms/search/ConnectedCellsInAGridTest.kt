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


}
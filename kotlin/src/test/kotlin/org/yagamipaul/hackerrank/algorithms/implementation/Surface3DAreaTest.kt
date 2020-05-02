package org.yagamipaul.hackerrank.algorithms.implementation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class Surface3DAreaTest {

    @Test
    fun `test case 1`() {
        val res = Surface3DArea().surfaceArea(
            arrayOf(
                arrayOf(1, 3, 4),
                arrayOf(2, 2, 3),
                arrayOf(1, 2, 4)
            )
        )

        Assertions.assertThat(res).isEqualTo(60)
    }

    @Test
    fun `test case 2`() {
        val res = Surface3DArea().surfaceArea(
            arrayOf(arrayOf(1))
        )

        Assertions.assertThat(res).isEqualTo(6)
    }

    @Test
    fun `test case 3`() {
        val res = Surface3DArea().surfaceArea(
            arrayOf(
                arrayOf(
                    51, 32, 28, 49, 28, 21, 98, 56, 99, 77
                )
            )
        )
        Assertions.assertThat(res).isEqualTo(1482)
    }


}
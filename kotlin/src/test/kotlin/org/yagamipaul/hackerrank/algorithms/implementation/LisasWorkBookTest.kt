package org.yagamipaul.hackerrank.algorithms.implementation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class LisasWorkBookTest {

    @Test
    fun `test case 1`() {
        val res = LisasWorkBook().workbook(5, 3, arrayOf(4, 2, 6, 1, 10))
        Assertions.assertThat(res).isEqualTo(4)
    }
}

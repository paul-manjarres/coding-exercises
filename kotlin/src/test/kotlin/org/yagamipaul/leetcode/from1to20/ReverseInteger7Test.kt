package org.yagamipaul.leetcode.from1to20

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ReverseInteger7Test {

    @Test
    fun `Test example`() {
        var obj = ReverseInteger7()
        Assertions.assertThat(obj.reverse(123)).isEqualTo(321)
        Assertions.assertThat(obj.reverse(-123)).isEqualTo(-321)
        Assertions.assertThat(obj.reverse(120)).isEqualTo(21)
        Assertions.assertThat(obj.reverse(123)).isEqualTo(321)
        Assertions.assertThat(obj.reverse(1534236469)).isEqualTo(0)
        Assertions.assertThat(obj.reverse(-2147483648)).isEqualTo(0)
    }
}

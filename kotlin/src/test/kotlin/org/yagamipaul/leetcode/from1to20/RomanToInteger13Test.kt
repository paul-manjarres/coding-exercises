package org.yagamipaul.leetcode.from1to20

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class RomanToInteger13Test{

    @Test
    fun `Test cases`(){
        val obj = RomanToInteger13()
        Assertions.assertThat(obj.romanToInt("III")).isEqualTo(3)
        Assertions.assertThat(obj.romanToInt("IV")).isEqualTo(4)
        Assertions.assertThat(obj.romanToInt("IX")).isEqualTo(9)
        Assertions.assertThat(obj.romanToInt("LVIII")).isEqualTo(58)
        Assertions.assertThat(obj.romanToInt("MCMXCIV")).isEqualTo(1994)
        Assertions.assertThat(obj.romanToInt("MMMDXLIX")).isEqualTo(3549)
    }

}
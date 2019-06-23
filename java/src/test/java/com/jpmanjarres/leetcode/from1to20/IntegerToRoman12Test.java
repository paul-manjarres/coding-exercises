package com.jpmanjarres.leetcode.from1to20;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRoman12Test {

    @Test
    public void tests(){
        var obj = new IntegerToRoman12();
        Assertions.assertThat(obj.intToRoman(3)).isEqualTo("III");
        Assertions.assertThat(obj.intToRoman(5)).isEqualTo("V");
        Assertions.assertThat(obj.intToRoman(9)).isEqualTo("IX");
        Assertions.assertThat(obj.intToRoman(90)).isEqualTo("XC");
        Assertions.assertThat(obj.intToRoman(40)).isEqualTo("XL");
        Assertions.assertThat(obj.intToRoman(500)).isEqualTo("D");
        Assertions.assertThat(obj.intToRoman(58)).isEqualTo("LVIII");
        Assertions.assertThat(obj.intToRoman(1994)).isEqualTo("MCMXCIV");
        Assertions.assertThat(obj.intToRoman(3549)).isEqualTo("MMMDXLIX");
    }
}

package com.jpmanjarres.leetcode.from1to20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefix14Test {

    @Test
    void case1(){
        String[] data = {"flower","flow","flight"};
        String res = LongestCommonPrefix14.longestCommonPrefix(data);
        assertThat(res).isEqualTo("fl");
    }

    @Test
    void case2(){
        String[] data = {"dog","racecar","car"};
        String res = LongestCommonPrefix14.longestCommonPrefix(data);
        assertThat(res).isEmpty();
    }

    @Test
    void case3(){
        String[] data = {"","racecar","car"};
        String res = LongestCommonPrefix14.longestCommonPrefix(data);
        assertThat(res).isEmpty();
    }

}
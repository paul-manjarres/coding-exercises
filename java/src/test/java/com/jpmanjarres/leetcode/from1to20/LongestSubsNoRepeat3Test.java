package com.jpmanjarres.leetcode.from1to20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class LongestSubsNoRepeat3Test {

    private final LongestSubsNoRepeat3 obj = new LongestSubsNoRepeat3();

    @Test
    void test1() {
        // Given
        String input = "abcabcbb";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(3);
    }

    @Test
    void test2() {
        // Given
        String input = "bbbbb";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(1);
    }

    @Test
    void test3() {
        // Given
        String input = "pwwkew";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(3);
    }

    @Test
    void test4() {
        // Given
        String input = " ";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(1);
    }

    @Test
    void test5() {
        // Given
        String input = "";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(0);
    }

    @Test
    void test6() {
        // Given
        String input = "abcde";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(5);
    }

    @Test
    void test7() {
        // Given
        String input = "dvdf";

        // When
        int result = obj.lengthOfLongestSubstring(input);

        // Then
        then(result).isEqualTo(3);
    }

}
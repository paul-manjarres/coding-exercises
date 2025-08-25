package com.jpmanjarres.leetcode.from61to80;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class Sqrt69Test {

    @Test
    void test() {
        // Given
      Sqrt69 sqrt = new Sqrt69();

        // When

        // Then
        then(sqrt.mySqrt(4)).isEqualTo(2);
        then(sqrt.mySqrt(8)).isEqualTo(2);
        then(sqrt.mySqrt(64)).isEqualTo(8);
        then(sqrt.mySqrt(50)).isEqualTo(7);
        then(sqrt.mySqrt(147)).isEqualTo(12);
        then(sqrt.mySqrt(2147395600)).isEqualTo(46340);

    }

}
package com.jpmanjarres.leetcode.from1to20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class ValidParentheses20Test {

    @ParameterizedTest
    @MethodSource(value = "getInputs")
    void test(TestInput input) {
        // Given
        ValidParentheses20 solution = new ValidParentheses20();

        // Then
        then(solution.isValid(input.str())).isEqualTo(input.result());
    }

    record TestInput(String str, boolean result) {
        @Override
        public String toString() {
            return "Input: '%s' - Result: %s".formatted(str, result);
        }
    }

    public static Stream<TestInput> getInputs() {
        return Stream.of(
            new TestInput("()", true),
            new TestInput("()[]{}", true),
            new TestInput("(]", false),
            new TestInput("([])", true)
        );
    }

}
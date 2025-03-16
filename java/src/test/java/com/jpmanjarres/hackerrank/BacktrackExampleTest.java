package com.jpmanjarres.hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BacktrackExampleTest {

    @Test
    public void test() {
        int[][] data = {
            {10, -10, -1, 1, 3, 0},
            {0, 0, 0, 0, 0, 0, 1}
        };
        int[] solutions = {1, 0};
        var b = new BacktrackExample();
        for (int i = 0; i < data.length; i++) {
            var res = b.solution(data[i]);
            assertEquals(solutions[i], res);
        }
    }
}

package com.jpmanjarres.company1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FooBarCh4Test {

    @Test
    void case1() {
        int[][] data = {
            {0, 1, 0, 0, 0, 1},
            {4, 0, 0, 3, 2, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {0, 3, 2, 9, 14}, res);
    }

    @Test
    void case2() {
        int[][] data = {{0, 2, 1, 0, 0}, {0, 0, 0, 3, 4}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {7, 6, 8, 21}, res);
    }

    @Test
    void trivialCase1() {
        int[][] data = {{0, 1}, {0, 0}};
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 1}, res);
    }

    @Test
    void trivialCase2() {
        int[][] data = {{0, 1, 1}, {0, 0, 0}, {0, 0, 0}};
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 1, 2}, res);
    }

    @Test
    void case3() {
        int[][] data = {{0, 1, 3, 0, 0}, {2, 0, 0, 3, 0}, {0, 0, 0, 0, 5}, {0, 0, 0, 0, 5}, {0, 0, 0, 0, 0}};
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 1}, res);
    }

    @Test
    void case4() {
        int[][] data = {
            {0, 1, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}
        };
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 1, 2, 2, 6}, res);
    }

    @Test
    void case5() {
        int[][] data = {
            {1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 2, 2, 2}, res);
    }

    @Test
    void case6() {
        int[][] data = {
            {0, 1, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 1, 9, 11}, res);
    }

    @Test
    void testFindCycleProbability() {

        FooBarCh4.PathProb path = new FooBarCh4.PathProb();
        path.addNode(0, new FooBarCh4.Rational(1, 1));
        path.addNode(1, new FooBarCh4.Rational(1, 2));
        path.addNode(2, new FooBarCh4.Rational(1, 2));
        path.addNode(0, new FooBarCh4.Rational(1, 3));
        path.addNode(1, new FooBarCh4.Rational(1, 2));
        path.addNode(2, new FooBarCh4.Rational(1, 2));

        FooBarCh4.Rational r = FooBarCh4.findCycleProbability(path);
        assertEquals(r, new FooBarCh4.Rational(1, 11));
    }

    @Test
    void case7() {
        int[][] data = {
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 2},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 5, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        int[] res = FooBarCh4.solution(data);
        assertArrayEquals(new int[] {1, 1, 9, 11}, res);
    }
}

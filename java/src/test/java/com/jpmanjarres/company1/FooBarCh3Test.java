package com.jpmanjarres.company1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FooBarCh3Test {

    @Test
    void test() {
        int[] data = {3, 1, 4, 1};
        int res = FooBarCh3.solution(data);
        assertEquals(4311, res);
    }

    @Test
    void test2() {
        int[] data = {3, 1, 4, 1, 5, 9};
        int res = FooBarCh3.solution(data);
        assertEquals(94311, res);
    }

    @Test
    void test3() {
        int[] data = {1};
        int res = FooBarCh3.solution(data);
        assertEquals(0, res);
    }

    @Test
    void test4() {
        int[] data = {0, 0, 0, 0, 0, 0, 0, 0, 1};
        int res = FooBarCh3.solution(data);
        assertEquals(0, res);
    }
}

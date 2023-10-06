package com.jpmanjarres.company1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooBarCh4Test {

  @Test
  void test() {
    int[][] data = {{0, 1, 0, 0, 0, 1}, {4, 0, 0, 3, 2, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[] res = FooBarCh4.solution(data);
    assertArrayEquals(new int[]{0, 3, 2, 9, 14}, res);
  }

  @Test
  void test2() {
    int[][] data = {{0, 2, 1, 0, 0}, {0, 0, 0, 3, 4}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    int[] res = FooBarCh4.solution(data);
    assertArrayEquals(new int[]{7, 6, 8, 21}, res);
  }

  @Test
  void trivialCase1() {
    int[][] data = {{0, 1}, {0, 0}};
    int[] res = FooBarCh4.solution(data);
    assertArrayEquals(new int[]{1, 1}, res);
  }

  @Test
  void trivialCase2() {
    int[][] data = {{0, 1, 1}, {0, 0,0}, {0, 0,0}};
    int[] res = FooBarCh4.solution(data);
    assertArrayEquals(new int[]{1, 1, 2}, res);
  }

}
package com.jpmanjarres.company1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class FooBarCh2 {

  public static void main(String[] args) {
    System.out.println("Solution: " + solution(new int[]{1, 2, 3}));         // 6
    System.out.println("Solution: " + solution(new int[]{2, 0, 2, 2, 0}));   // 8
    System.out.println("Solution: " + solution(new int[]{-2, -3, 4, -5}));   // 60
    System.out.println("Solution: " + solution(new int[]{2, 3, 4, 5, 6}));   // 360
    int[] maxCase = new int[50];
    for (int i = 0; i < 50; i++) {
      maxCase[i] = 1000;
    }
    System.out.println("Solution: "+solution(maxCase));   //
  }

  public static String solution(int[] xs) {
    // Your code here
    // Generate all valid subsets
    // System.out.println("\nArray: " + Arrays.stream(xs).mapToObj(String::valueOf).collect(Collectors.joining(",")));

    // 0. Remove 0s and 1s
    int[] xsOrig = xs;
    xs = Arrays.stream(xs).filter(i -> i != 0 && i != 1).toArray();

    // 1. Check if all are positive, calculate the whole product
    if (Arrays.stream(xs).filter(i -> i > 0).count() == xsOrig.length) {
      int smaller = Arrays.stream(xs).sorted().min().orElse(1);
      for (int i = 0; i < xs.length; i++) {
        if (xs[i] == smaller) {
          xs[i] = 0;
          break;
        }
      }
      xs = Arrays.stream(xs).filter(i -> i != 0).toArray();
      return Arrays.stream(xs)
          .mapToObj(BigInteger::valueOf)
          .reduce(BigInteger.ONE, BigInteger::multiply)
          .toString();
    }

    // 2. Check if the negative are even or odd
    long countNegatives = Arrays.stream(xs).filter(i -> i < 0).count();
    if (countNegatives % 2 == 1) {
      int smaller = Arrays.stream(xs).filter(i -> i < 0).map(Math::abs).sorted().toArray()[0] * (-1);
      for (int i = 0; i < xs.length; i++) {
        if (xs[i] == smaller) {
          xs[i] = 0;
          break;
        }
      }
      xs = Arrays.stream(xs).filter(i -> i != 0).toArray();
    }

    Set<ArrayList<Integer>> subsets = generateSubsets(xs, 0, new ArrayList<>(), new HashSet<>());
    System.out.println("Amount of subsets: " + subsets.size());
    subsets.forEach(System.out::println);

    return subsets.stream()
        .map(arr -> arr.stream().reduce(BigInteger.ONE,
            (i, j) -> i.multiply(BigInteger.valueOf(j)),
            BigInteger::multiply)
        )
        .max(BigInteger::compareTo)
        .map(Object::toString).orElse("");
  }

  public static Set<ArrayList<Integer>> generateSubsets(int[] xs, int i, ArrayList<Integer> subset, Set<ArrayList<Integer>> set) {
    if (i == xs.length) {

      if(!subset.isEmpty()) {
        set.add(new ArrayList<>(subset));
      }
      return set;
    }
    subset.add(xs[i]);
    generateSubsets(xs, i + 1, subset, set);
    subset.remove(subset.size() - 1);
    generateSubsets(xs, i + 1, subset, set);
    return set;
  }

}

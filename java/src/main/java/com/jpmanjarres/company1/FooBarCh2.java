package com.jpmanjarres.company1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FooBarCh2 {

  public static void main(String[] args) {
    System.out.println("Solution: " + solution(new int[]{-2,0,0}));  //0
    System.out.println("Solution: " + solution(new int[]{1, 2, 3})+" - 6");          // 6
    System.out.println("Solution: " + solution(new int[]{0,0,-2,2})+" - 2");         // 6
    System.out.println("Solution: " + solution(new int[]{2, 0, 2, 2, 0})+" - 8");    // 8
    System.out.println("Solution: " + solution(new int[]{2,-3,1,0,-5})+" - 30");     // 30
    System.out.println("Solution: " + solution(new int[]{-2, -3, 4, -5})+" - 60");   // 60
    System.out.println("Solution: " + solution(new int[]{2, 3, 4, 5, 6})+" - 360" ); // 360
    System.out.println("Solution: " + solution(new int[]{-2, 3, -4, 5}) + " - 40");   // 40
    System.out.println("Solution: " + solution(new int[]{-2, 3, -4, 5, -1}) + " - 120");   // 120
    System.out.println("Solution: " + solution(new int[]{-2, 3, -4, 5, -6, -8})+ " - 1920");   // 1920
    int[] maxCase = new int[50];
    for (int i = 0; i < 50; i++) {
      maxCase[i] = 1000;
    }
    System.out.println("Solution: " + solution(maxCase));   // 100000000000000000000000000
  }

  public static String solution(int[] xs) {

    if(xs.length == 1){
      return String.valueOf(xs[0]);
    }

    //System.out.println(Arrays.toString(xs));
    Arrays.sort(xs);
    //System.out.println("Sorted: " + Arrays.stream(xs).mapToObj(String::valueOf).collect(Collectors.joining(",")));

    int pair = 0;
    int[] pairId = new int[2];
    List<Integer> newArray = new ArrayList<>();
    for (int i = 0; i < xs.length; i++) {
      if (xs[i] < 0) {
        pair++;
        pairId[pair - 1] = i;
        if (pair == 2) {
          newArray.add(xs[pairId[0]] * xs[pairId[1]]);
          pair = pairId[0] = pairId[1] = 0;
        }
      } else {
        newArray.add(xs[i]);
      }
    }

    if (pair == 1) {
      newArray.add(xs[pairId[0]]);
    }

    int newArrayLength = newArray.size();
    //System.out.println("newArray: " + newArray + " Length: " + newArrayLength);
    int currentMax = newArray.stream().max(Integer::compare).get();
    newArray = new ArrayList<>(newArray.stream().filter(i -> i != 0 && i != 1 && i != -1).sorted().collect(Collectors.toList()));
    //System.out.println("newArray: " + newArray + " Length: " + newArrayLength);

    if (newArray.size() == newArrayLength) {
      newArray.remove(0);
    }

    if(newArray.size() == 1){
      return String.valueOf(Math.max(newArray.get(0), currentMax));
    }

    return newArray.stream()
        .filter(i -> i>0)
        .map(BigInteger::valueOf)
        .reduce(BigInteger.ONE, BigInteger::multiply)
        .toString();
  }

  /*
  public static String solution2(int[] xs) {
    // Your code here
    System.out.println("\nArray: " + Arrays.stream(xs).mapToObj(String::valueOf).collect(Collectors.joining(",")));

    int[] xsOrig = xs;
    xs = Arrays.stream(xs).sorted().toArray();


//
//    // 0. Check if the negative are even or odd
//    long countNegatives = Arrays.stream(xs).filter(i -> i < 0).count();
//    if (countNegatives % 2 == 1) {
//      int smaller = Arrays.stream(xs).filter(i -> i < 0).map(Math::abs).sorted().toArray()[0] * (-1);
//      for (int i = 0; i < xs.length; i++) {
//        if (xs[i] == smaller) {
//          xs[i] = 0;
//          break;
//        }
//      }
//      xs = Arrays.stream(xs).filter(i -> i != 0 && i != 1).toArray();
//    }
//
    // 2. Remove 0s and 1s
    xs = Arrays.stream(xs).filter(i -> i != 0 && i != 1 && i != -1).toArray();

    if (Arrays.stream(xs).filter(i -> i > 0).count() == xs.length) {
      if (xs.length < xsOrig.length) {
        return Arrays.stream(xs)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply)
            .toString();
      } else if (xs.length == xsOrig.length) {
        xs[0] = 1;
        return Arrays.stream(xs)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply)
            .toString();
      }
    }

    Set<ArrayList<Integer>> subsets = generateSubsets(xs, 0, new ArrayList<>(), new HashSet<>());
    System.out.println("Amount of subsets: " + subsets.size());
    subsets.forEach(System.out::println);

    subsets = subsets.stream().filter(s -> s.size() < xsOrig.length).collect(Collectors.toSet());


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
      if (!subset.isEmpty()) {
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

  */

}

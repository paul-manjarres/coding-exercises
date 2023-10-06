package com.jpmanjarres.company1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FooBarCh3 {


  public static int solution(int[] l) {
    // Your code here

    Set<ArrayList<Integer>> subsets = generateSubsets(l, 0, new ArrayList<>(), new HashSet<>());
    //System.out.println(Arrays.toString(l)+" Amount of subsets: " + subsets.size());
    // subsets.forEach(System.out::println);

    subsets = subsets.stream().filter(arr -> arr.stream().mapToInt(Integer::valueOf).sum() % 3 == 0).collect(Collectors.toSet());
    //System.out.println("Divisibles por 3: "+subsets.size());
    //subsets.forEach(System.out::println);

    int maxSize = subsets.stream().mapToInt(ArrayList::size).max().orElse(0);
    Set<ArrayList<Integer>> candidates = subsets.stream().filter(arr -> arr.size() == maxSize).collect(Collectors.toSet());

    int maxNumber = 0;
    for (ArrayList<Integer> list : candidates) {
      list.sort(Collections.reverseOrder());
      maxNumber = Math.max(maxNumber, Integer.parseInt(list.stream().map(String::valueOf).collect(Collectors.joining(""))));
    }

    return maxNumber;
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

}

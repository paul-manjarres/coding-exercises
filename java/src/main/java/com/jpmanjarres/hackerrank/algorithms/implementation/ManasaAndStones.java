/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 30/04/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     30/04/2017
 */
public class ManasaAndStones {

  public static void solve(int n, int a, int b) {
    Set<Integer> set = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      set.add((n - 1 - i) * a + i * b);
    }

    List<Integer> list = new ArrayList<>(set);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }

  ///////////////////
  // main
  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    for (int _i = 0; _i < t; _i++) {
      int n = in.nextInt();
      int a = in.nextInt();
      int b = in.nextInt();

      solve(n, a, b);
      System.out.println();
    }
    in.close();
  }
}

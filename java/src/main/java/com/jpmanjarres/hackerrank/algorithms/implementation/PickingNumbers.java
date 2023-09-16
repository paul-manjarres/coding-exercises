/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 10/04/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     10/04/2017
 */
public class PickingNumbers {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int ar[] = new int[n];
    for (int _i = 0; _i < n; _i++) {
      ar[_i] = in.nextInt();
    }

    Arrays.sort(ar);

    int max = 1;
    for (int i = 0; i < ar.length - 1; i++) {
      int sum = 1;
      for (int j = i + 1; j < ar.length; j++) {
        if (Math.abs(ar[i] - ar[j]) <= 1) {
          sum++;
        }
      }
      max = Math.max(sum, max);
    }

    System.out.println(max);
    in.close();
  }
}

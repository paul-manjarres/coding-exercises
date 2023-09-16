/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 6/04/2017
 */
package com.jpmanjarres.hackerrank.basic;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     6/04/2017
 */
public class PermutationEquation {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] ar = new int[n];
    for (int _i = 0; _i < n; _i++) {
      ar[_i] = in.nextInt();
    }

    for (int i = 1; i <= n; i++) {

      int px = 0;
      int ppy = 0;

      for (int j = 0; j < ar.length; j++) {
        if (ar[j] == i) {
          px = j + 1;
          break;
        }
      }

      for (int j = 0; j < ar.length; j++) {
        if (ar[j] == px) {
          ppy = j + 1;
          break;
        }
      }
      System.out.println(ppy);
    }

    in.close();
  }
}

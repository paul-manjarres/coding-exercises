/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 22/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     22/03/2017
 */
public class HurdleRace {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();

    int max = k;

    for (int _i = 0; _i < n; _i++) {
      int h = in.nextInt();
      if (h > max) {
        max = h;
      }
    }
    System.out.println(max - k);
    in.close();
  }
}

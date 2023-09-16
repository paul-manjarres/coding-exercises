/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 30/03/2017
 */
package com.jpmanjarres.hackerrank.contest.euler;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     30/03/2017
 */
public class SmallestMultiple {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    for (int _i = 0; _i < t; _i++) {

      int n = in.nextInt();

      long num = IntStream.range(1, n + 1).filter(i -> isPrime(i)).reduce(1, (x, y) -> x * y);

      long max = IntStream.range(1, n + 1).reduce(1, (x, y) -> x * y);

      for (long i = num; i <= max; i++) {

        boolean isDiv = true;

        for (int j = 2; j <= n; j++) {
          if (i % j != 0) {
            isDiv = false;
            break;
          }
        }

        if (isDiv) {
          System.out.println(i);
          break;
        }
      }
    } // end for test cases

    in.close();
  }

  public static boolean isPrime(int n) {
    if (n < 2) return false;

    int root = (int) Math.sqrt(n);
    for (int i = 2; i <= root; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}

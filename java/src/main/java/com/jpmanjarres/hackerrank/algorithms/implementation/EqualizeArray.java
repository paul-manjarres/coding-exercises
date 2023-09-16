/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 21/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     21/03/2017
 */
public class EqualizeArray {

  public static void main(String[] args) {

    final Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] A = new int[N];
    int[] freq = new int[101];

    int max = 0;
    int maxIdx = 0;

    for (int z = 0; z < N; z++) {
      A[z] = in.nextInt();
      freq[A[z]]++;

      if (freq[A[z]] > max) {
        max = freq[A[z]];
        maxIdx = A[z];
      }
    }

    int sum = 0;
    for (int i = 0; i < freq.length; i++) {
      if (i != maxIdx) {
        sum += freq[i];
      }
    }

    System.out.println(sum);
    in.close();
  }
}

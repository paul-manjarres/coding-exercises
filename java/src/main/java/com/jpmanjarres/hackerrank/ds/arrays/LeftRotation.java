/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 12/03/2017
 */
package com.jpmanjarres.hackerrank.ds.arrays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     12/03/2017
 */
public class LeftRotation {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int d = in.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    in.close();

    arr = rotateLeft(arr, d);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  /**
   * @param arr
   * @param d
   * @return
   */
  public static int[] rotateLeft(int[] arr, int d) {

    int realRots = d % arr.length;
    for (int j = 0; j < realRots; j++) {
      int temp = arr[0];
      for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
      }
      arr[arr.length - 1] = temp;
    }
    return arr;
  }
}

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
public class LarrysArray {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    for (int _i = 0; _i < t; _i++) {
      int n = in.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
      }

      boolean canSort = false;

      for (int i = 0; i < n - 2; i++) {
        canSort = false;

        int[] temp = {arr[i], arr[i + 1], arr[i + 2]};

        for (int j = 0; j < 3; j++) {
          if (temp[0] <= temp[1] && temp[1] <= temp[2]) {
            canSort = true;
            arr[i] = temp[0];
            arr[i + 1] = temp[1];
            arr[i + 2] = temp[2];
            break;
          }
          rotateLeft(temp, 1);
        }
      }
      System.out.println(canSort ? "YES" : "NO");
    }
    in.close();
  }

  /**
   * Rotate array elements to left
   *
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

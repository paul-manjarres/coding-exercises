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
public class CatsAndAMouse {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    for (int l = 0; l < N; l++) {

      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();

      if (Math.abs(z - x) == Math.abs(z - y)) {
        System.out.println("Mouse C");
      } else if (Math.abs(z - x) < Math.abs(z - y)) {
        System.out.println("Cat A");
      } else if (Math.abs(z - x) < Math.abs(z - y)) {
        System.out.println("Cat A");
      } else {
        System.out.println("Cat B");
      }
    }
    in.close();
  }
}

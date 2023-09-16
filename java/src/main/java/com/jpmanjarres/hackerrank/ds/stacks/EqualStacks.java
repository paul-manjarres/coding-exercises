/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 15/03/2017
 */
package com.jpmanjarres.hackerrank.ds.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     15/03/2017
 */
public class EqualStacks {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();

    final Deque<Integer> stack1 = new ArrayDeque<>(n1 + 1);
    final Deque<Integer> stack2 = new ArrayDeque<>(n2 + 1);
    final Deque<Integer> stack3 = new ArrayDeque<>(n3 + 1);

    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;

    int val = 0;

    for (int x = 0; x < n1; x++) {
      val = in.nextInt();
      stack1.add(val);
      sum1 += val;
    }
    for (int x = 0; x < n2; x++) {
      val = in.nextInt();
      stack2.add(val);
      sum2 += val;
    }
    for (int x = 0; x < n3; x++) {
      val = in.nextInt();
      stack3.add(val);
      sum3 += val;
    }

    while (true) {
      if (sum1 == sum2 && sum1 == sum3) {
        System.out.println(sum1);
        break;
      }

      if (sum1 >= sum2 && sum1 >= sum3) {
        val = stack1.pop();
        sum1 -= val;
      } else if (sum2 >= sum1 && sum2 >= sum3) {
        val = stack2.pop();
        sum2 -= val;
      } else if (sum3 >= sum1 && sum3 >= sum2) {
        val = stack3.pop();
        sum3 -= val;
      }
    }

    in.close();
  }
}

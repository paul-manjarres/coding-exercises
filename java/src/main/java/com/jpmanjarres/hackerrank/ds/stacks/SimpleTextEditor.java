/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 16/03/2017
 */
package com.jpmanjarres.hackerrank.ds.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     16/03/2017
 */
public class SimpleTextEditor {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    Deque<Operation> stack = new ArrayDeque<>();

    int N = in.nextInt();

    String s = "";

    for (int z = 0; z < N; z++) {

      int type = in.nextInt();

      if (type == 1) {
        String w = in.next();
        Operation op = new Operation(1, w, s);
        stack.push(op);
        s = s + w;

      } else if (type == 2) {
        int k = in.nextInt();
        Operation op = new Operation(2, k, s);
        stack.push(op);

        int len = s.length();
        s = s.substring(0, len - k);

      } else if (type == 3) {

        int k = in.nextInt();
        System.out.println(s.charAt(k - 1));

      } else if (type == 4) {
        s = stack.pop().s;
      }
    }
    in.close();
  }

  static class Operation {
    int type;
    Object param;
    String s;

    public Operation(int type, Object param, String s) {
      super();
      this.type = type;
      this.param = param;
      this.s = s;
    }
  }
}

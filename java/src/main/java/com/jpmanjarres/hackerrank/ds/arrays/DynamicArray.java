/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 12/03/2017
 */
package com.jpmanjarres.hackerrank.ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     12/03/2017
 */
public class DynamicArray {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int Q = in.nextInt();

    Object[] seqList = new Object[N];
    for (int i = 0; i < N; i++) {
      seqList[i] = new ArrayList<Integer>();
    }

    int lastAns = 0;

    for (int i = 0; i < Q; i++) {

      int type = in.nextInt();
      int x = in.nextInt();
      int y = in.nextInt();

      int index = (x ^ lastAns) % N;
      List<Integer> seq = (List<Integer>) seqList[index];

      if (type == 1) {
        seq.add(y);
      } else {
        lastAns = seq.get(y % seq.size());
        System.out.println(lastAns);
      }
    }
    in.close();
  }
}

/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 21/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     21/03/2017
 */
public class MiniMaxSum {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        int N = 5;
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = in.nextInt();
        }

        Arrays.sort(d);
        System.out.println(d[0] + d[1] + d[2] + d[3] + " " + (d[1] + d[2] + d[3] + d[4]));

        in.close();
    }
}

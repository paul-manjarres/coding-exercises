/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 22/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     22/03/2017
 */
public class BiggerIsGreater {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int _i = 0; _i < n; _i++) {

            // START

            String w = in.next();
            char[] temp = w.toCharArray();

            int pivotIdx = -1;
            for (int i = temp.length - 1; i > 0; i--) {
                if (temp[i - 1] < temp[i]) {
                    pivotIdx = i - 1;
                    break;
                }
            }

            if (pivotIdx == -1) {
                System.out.println("no answer");

            } else {

                int nextIdx = -1;
                for (int i = pivotIdx + 1; i < temp.length; i++) {
                    if (nextIdx == -1 && temp[i] > temp[pivotIdx]
                            || (nextIdx != -1 && temp[i] > temp[pivotIdx] && temp[i] <= temp[nextIdx])) {
                        nextIdx = i;
                    }
                }

                char swap = temp[nextIdx];
                temp[nextIdx] = temp[pivotIdx];
                temp[pivotIdx] = swap;

                char[] right = Arrays.copyOfRange(temp, pivotIdx + 1, temp.length);
                Arrays.sort(right);

                char[] left = Arrays.copyOfRange(temp, 0, pivotIdx + 1);

                System.out.println(new String(left) + new String(right));
            }
        }
        in.close();
    }
}

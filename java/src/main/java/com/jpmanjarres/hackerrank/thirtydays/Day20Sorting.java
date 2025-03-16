/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 9/03/2017
 */
package com.jpmanjarres.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     9/03/2017
 */
public class Day20Sorting {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int swaps = sort(array);

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[N - 1]);

        in.close();
    }

    /**
     * @param a
     * @return
     */
    public static int sort(int[] a) {

        int n = a.length;
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            totalSwaps += numberOfSwaps;
        }
        return totalSwaps;
    }
}

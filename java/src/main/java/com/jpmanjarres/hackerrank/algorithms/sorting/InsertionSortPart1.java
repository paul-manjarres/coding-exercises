/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2015 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Propietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 26/11/2015
 */
package com.jpmanjarres.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class InsertionSortPart1 {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function

        int val = ar[ar.length - 1];

        boolean inserted = false;

        for (int i = ar.length - 2; i >= 0; i--) {

            if (val < ar[i]) {
                ar[i + 1] = ar[i];
            } else if (val > ar[i]) {
                ar[i + 1] = val;
                inserted = true;
                break;
            }
            printArray(ar);
        }

        if (!inserted) {
            ar[0] = val;
        }

        printArray(ar);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}

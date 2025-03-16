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
public class CorrectnessAndTheLoopInvariant {

    public static void insertionSort(int[] A) {

        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
    }
}

/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2015 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Propietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 26/11/2015
 *
 */
package com.jpmanjarres.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 *
 */
public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar) {

		for (int i = 1; i < ar.length; i++) {
			int j=i;
			while(j>0 && ar[j-1]>ar[j]){
				int temp = ar[j];
				ar[j] = ar[j-1];
				ar[j-1]=temp;
				j--;
			}
			printArray(ar);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}

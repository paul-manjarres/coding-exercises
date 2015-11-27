/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2015 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Propietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 26/11/2015
 *
 */
package com.jpmanjarres.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 *
 */
public class Quicksort2Sorting {

	static void quickSort(int[] ar) {


		int partition = ar[0];

		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for (int i = 1; i < ar.length; i++) {

			if(ar[i]< partition){
				left.add(ar[i]);
			}else{
				right.add(ar[i]);
			}

		}






	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar);
	}

}

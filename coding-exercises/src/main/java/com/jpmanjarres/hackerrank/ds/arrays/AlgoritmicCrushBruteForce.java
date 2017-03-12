/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 12/03/2017
 *
 */
package com.jpmanjarres.hackerrank.ds.arrays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         12/03/2017
 *
 */
public class AlgoritmicCrushBruteForce {

	public static void main(String[] args) {

		final Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		long[] arr = new long[N];

		long max = Long.MIN_VALUE;

		for (int i = 0; i < M; i++) {

			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();

			for (int j = a; j <= b; j++) {
				arr[j - 1] += k;
				max = Math.max(max, arr[j - 1]);
			}
		}

		System.out.println(max);

		in.close();
	}

}

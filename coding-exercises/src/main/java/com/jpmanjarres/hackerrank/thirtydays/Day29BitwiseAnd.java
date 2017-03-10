/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 10/03/2017
 *
 */
package com.jpmanjarres.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         10/03/2017
 *
 */
public class Day29BitwiseAnd {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int i = 0; i < T; i++) {

			int N = in.nextInt();
			int K = in.nextInt();


			int max = 0;

			for (int j = 1; j < N; j++) {
				for (int j2 = j+1; j2 <= N; j2++) {
					int and = j & j2;
					if( and > max && and < K ){
						max = and;
					}
				}
			}

			System.out.println(max);
		}
		in.close();

	}

}

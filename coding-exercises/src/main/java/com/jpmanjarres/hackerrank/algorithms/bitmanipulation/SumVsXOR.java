/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 21/03/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         21/03/2017
 *
 */
public class SumVsXOR {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		in.close();

		if (n == 0) {
			System.out.println(1);
		} else {

			String s = Long.toBinaryString(n);

			int count = 0;
			for (char c : s.toCharArray()) {
				if (c == '0')
					count++;
			}
			System.out.println((long) Math.pow(2, count));
		}

	}

}

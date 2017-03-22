/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 22/03/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         22/03/2017
 *
 */
public class BeautifulDaysAtMovies {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();

		int count = 0;
		for (; i <= j; i++) {

			if (Math.abs(i - getReversed(i)) % k == 0) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}

	static int getReversed(int n) {
		return Integer.valueOf(reverse(Integer.toString(n)));
	}

	public static String reverse(String s) {
		final StringBuilder sb = new StringBuilder(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}

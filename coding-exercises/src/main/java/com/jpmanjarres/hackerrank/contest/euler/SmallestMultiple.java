/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 30/03/2017
 *
 */
package com.jpmanjarres.hackerrank.contest.euler;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         30/03/2017
 *
 */
public class SmallestMultiple {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int _i = 0; _i < t; _i++) {

			int n = in.nextInt();
			int min = getPrimes(n).stream().reduce(1, (x, y) -> x * y).intValue();
			System.out.println(min);

		}
		in.close();
	}

	static List<Integer> getPrimes(int n) {

		return IntStream.range(1, n)
				.filter(i -> isPrime(i))
				.boxed()
				.collect(Collectors.toList());

	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;

		int root = (int) Math.sqrt(n);
		for (int i = 2; i <= root; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}

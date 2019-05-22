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
public class FlippingBits {

	public static void main(String[] args) {

		final Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int z = 0; z < t; z++) {

			long val = in.nextLong();
			long mask = ((long) Math.pow(2, 32)) - 1;

			// System.out.println(Long.toBinaryString(val));
			// System.out.println(Long.toBinaryString(mask));
			// System.out.println(Long.toBinaryString(val^mask));
			System.out.println(val ^ mask);

		}
		in.close();

	}

}

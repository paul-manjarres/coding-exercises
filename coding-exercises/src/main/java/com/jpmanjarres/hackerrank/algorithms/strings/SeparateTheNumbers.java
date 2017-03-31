/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 23/03/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         23/03/2017
 *
 */
public class SeparateTheNumbers {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int q = in.nextInt();
		for (int _i = 0; _i < q; _i++) {
			String s = in.next();

			if (s.length() == 1) {
				System.out.println("NO");
			}

			int size = 1;
			int len = s.length();
			char[] ar = s.toCharArray();

			boolean btf = true;

			while (size <= len / 2) {

				btf = true;
				int start = 0;
				long first = 0;

				while (start + size <= len - size) {
					long n = getNumber(ar, size, start);
					long n2 = getNumber(ar, size, start + size);

					if (start == 0) {
						first = n;
					}

					long last = (long) Math.pow(10, size) - 1;
					if (n == last) {
						n2 = getNumber(ar, size + 1, start + size);
					}

					if ((n2 - n) != 1 || ar[start] == '0' || ar[start+size] == '0') {
						btf = false;
						break;
					}
					start += size;
					if (n == last) {
						size++;
					}
				}

				if (btf) {
					System.out.println("YES " + first);
					break;
				}

				size++;

			} // End While

			if (!btf) {
				System.out.println("NO");
			}

		}
		in.close();
	}

	static long getNumber(char[] ar, int size, int start) {
		char[] tmp = Arrays.copyOfRange(ar, start, start + size);
		return Long.valueOf(new String(tmp).trim());
	}

}

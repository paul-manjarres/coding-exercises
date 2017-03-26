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

			boolean beau = true;

			for (int i = 1; i <= s.length() / 2; i++) {
				beau = true;

				int[] arr = getIntArray(s.toCharArray(), i);

				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] >= arr[j + 1] || arr[j + 1] - arr[j] != 1) {
						beau = false;
						break;
					}
				}

				if (beau) {
					System.out.println("YES " + arr[0]);
					break;

				}

			}

			if (!beau) {
				System.out.println("NO");
				break;

			}




			// for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]+" ");
			// }

		}
		in.close();
	}

	static int[] getIntArray(char[] arr, int size) {
		int totalSize = (arr.length % size == 0) ? arr.length / size : (arr.length / size) + 1;
		int[] ret = new int[totalSize];
		int count = 0;

		for (int i = 0; i < arr.length; i = i + size) {
			char[] tmp = new char[size];
			Arrays.fill(tmp, ' ');
			for (int j = 0; j < size && j + i < arr.length; j++) {
				tmp[j] = arr[i + j];
			}
			ret[count] = Integer.valueOf(new String(tmp).trim());
			count++;
		}
		return ret;
	}

}

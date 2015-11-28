/**
 *
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 27/11/2015
 *
 */
public class TheLoveLetterMystery {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 0; i < N; i++) {

			String s = in.next();
			int len = s.length();

			char[] arr = s.toCharArray();
			int ops = 0;

			for (int j = 0, k = len - 1; j < s.length() / 2; j++, k--) {

				if (arr[j] != arr[k]) {

					if (arr[j] < arr[k]) {
						while (arr[j] != arr[k]) {
							arr[k]--;
							ops++;
						}
					} else {
						while (arr[j] != arr[k]) {
							arr[j]--;
							ops++;
						}
					}
				}
			}
			System.out.println(ops);

		}
		in.close();
	}

}

/**
 * Date: 27/11/2015
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 27/11/2015
 *
 */
public class Gemstones {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int[] sum = new int[26];
		int gemstone = 0;

		for (int i = 0; i < N; i++) {
			String stone = in.next();
			int[] count = new int[26];

			for (int j = 0; j < stone.length(); j++) {
				char c = stone.charAt(j);

				int index = c - 97;

				if (count[index] == 0) {
					count[index]++;
					sum[index]++;

					if (sum[index] == N) {
						gemstone++;
					}
				}
			}
		}

		System.out.println(gemstone);

		in.close();
	}

}

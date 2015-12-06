/**
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a>
 *         6/12/2015
 */
public class SherlockAndSquares {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 0; i < N; i++) {

			int A = in.nextInt();
			int B = in.nextInt();

			int count = 0;

			for (int j = (int) Math.sqrt(A), j2 = j * j; j2 <= B; j++, j2 = j* j) {
				if (j2 >= A && j2 <= B) {
					count++;
				}
			}
			System.out.println(count);
		}
		in.close();
	}

}

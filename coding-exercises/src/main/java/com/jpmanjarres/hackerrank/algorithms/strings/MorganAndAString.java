/**
 * Date: 1/12/2015
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 1/12/2015
 *
 */
public class MorganAndAString {

	// Check who is the array to take elements from if the two elements on top are equal.
	public static int checkWhosNext(char[] A, char[] B) {
		for (int i = 0;; i++) {
			if (i <= A.length - 1 && i <= B.length - 1) {
				if (A[i] < B[i]) {
					return 0;
				} else if (A[i] > B[i]) {
					return 1;
				} else {
					// Do nothing
				}
			} else if (i < A.length - 1 && i >= B.length - 1) {
				return 0;
			} else if (i >= A.length - 1 && i < B.length - 1) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			char[] A = in.next().toCharArray();
			char[] B = in.next().toCharArray();

			StringBuilder s = new StringBuilder();

			int j = 0;
			int k = 0;
			while (j + k < A.length + B.length) {

				if (j >= A.length) {
					s.append(B[k]);
					k++;
				} else if (k >= B.length) {
					s.append(A[j]);
					j++;
				} else if (A[j] < B[k]) {
					s.append(A[j]);
					j++;
				} else if (A[j] > B[k]) {
					s.append(B[k]);
					k++;
				} else if (A[j] == B[k]) {

					int direction = checkWhosNext(Arrays.copyOfRange(A, j, A.length), Arrays.copyOfRange(B, k, B.length));

					if (direction == 0) {
						s.append(A[j]);
						j++;
					}
					if (direction == 1) {
						s.append(B[k]);
						k++;
					}

				}
			}
			System.out.println(s.toString());

		}
		in.close();
	}

}

/**
 * Date: 1/12/2015
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 1/12/2015
 *
 */
public class MorganAndAString {


	// Check who is the array to take elements from if the two elements on top are equal.
	public static int checkWhosNext2(char[] A, int j, char[] B, int k) {
		for (;; j++, k++) {
			if (j < A.length  && k <  B.length ) {
				if(A[j]==B[k]){
					continue;
				}
				if (A[j] < B[k]) {
					return 0;
				} else if (A[j] > B[k]) {
					return 1;
				}
			} else if (j < A.length - 1 && k >= B.length - 1) {
				return 0;
			} else if (j >= A.length - 1 && k < B.length - 1) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		long start = System.currentTimeMillis();
		long end = start;

		for (int i = 0; i < T; i++) {
			char[] A = in.next().toCharArray();
			char[] B = in.next().toCharArray();

			StringBuilder s = new StringBuilder();

			int j = 0;
			int k = 0;
			int lengthSum = A.length + B.length;

			while (j + k < lengthSum ) {

				if (j >= A.length) {
					s.append(B[k]);
					k++;
				} else if (k >= B.length) {
					s.append(A[j]);
					j++;
				}else if (A[j] == B[k]) {

					int direction = checkWhosNext2(A, j, B, k);

					if (direction == 0) {
						s.append(A[j]);
						j++;
					}
					if (direction == 1) {
						s.append(B[k]);
						k++;
					}
				}

				else if (A[j] < B[k]) {
					s.append(A[j]);
					j++;
				} else if (A[j] > B[k]) {
					s.append(B[k]);
					k++;
				}
			}
			System.out.println(s.toString());


		}
		end = System.currentTimeMillis();
		System.out.println("Time : " + (end - start));
		in.close();
	}

}

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

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			char[] A = in.next().toCharArray();
			char[] B = in.next().toCharArray();

			int j = 0;
			int k = 0;

			StringBuilder s = new StringBuilder();

			while (j + k < A.length + B.length) {

				if (j >= A.length) {

					if (k + 1 < B.length) {

						if (B[k] <= B[k + 1]) {
							s.append(B[k]);
							s.append(B[k + 1]);
						} else {
							s.append(B[k + 1]);
							s.append(B[k]);
						}
						k += 2;
					}else{
						s.append(B[k]);
						k++;
					}



				} else if (k >= B.length) {

					if (j + 1 < A.length) {

						if (A[j] <= A[j + 1]) {
							s.append(A[j]);
							s.append(A[j + 1]);
						} else {
							s.append(A[j + 1]);
							s.append(A[j]);
						}
						j += 2;
					}else{
						s.append(A[j]);
						j++;
					}

//					s.append(A[j]);
//					j++;

				} else if (A[j] <= B[k]) {
					s.append(A[j]);
					j++;
				} else {
					s.append(B[k]);
					k++;
				}
			}
			System.out.println(s.toString());

		}
		in.close();
	}

}

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
	public static int checkWhosNext(char[] A, int j, char[] B, int k) {
		int sumA = 0;
		int sumB = 0;

		while (k < B.length  || j < A.length) {
			sumB += k < B.length ? (int) B[k] : (int) 'Z';
			sumA += j < A.length ? (int) A[j] : (int) 'Z';
			if (sumA == sumB) {
				k++;
				j++;
				continue;
			}
			return sumA < sumB ? 0 : 1;
		}
		return 0;
	}

	// Solve the problem for two arrays
	public static String solve(char[] A,char[] B){
		StringBuilder s = new StringBuilder();

		int j = 0;
		int k = 0;
		int lengthSum = A.length + B.length;

		while (j + k < lengthSum) {

			if (j >= A.length) {
				s.append(B[k++]);
			} else if (k >= B.length) {
				s.append(A[j++]);
			} else if (A[j] == B[k]) {
				s.append(checkWhosNext(A, j, B, k) == 0 ? A[j++] : B[k++]);
			} else {
				s.append(A[j] < B[k] ? A[j++] : B[k++]);
			}
		}
		return s.toString();
	}


	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		long start = System.currentTimeMillis();
		long end = start;

		for (int i = 0; i < T; i++) {
			char[] A = in.next().toCharArray();
			char[] B = in.next().toCharArray();
			System.out.println(solve(A, B));
		}

		end = System.currentTimeMillis();
		System.out.println("Time : " + (end - start));
		in.close();
	}

}

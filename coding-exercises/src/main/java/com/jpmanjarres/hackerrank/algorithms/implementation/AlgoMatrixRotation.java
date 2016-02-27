/**
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 9/12/2015
 *
 */
public class AlgoMatrixRotation {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int M = in.nextInt();
		int N = in.nextInt();
		int R = in.nextInt();

		int[][] A = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = in.nextInt();
			}
		}

		int layers = M < N ? M / 2 : N / 2;

		System.out.println("Layers : " + layers);

		// for (int k = 0; k < layers; k++) {

		Integer temp = null;

		
		for (int i = 0; i < A.length; i++) {

			
			for (int j = 0; j < A.length; j++) {

				if (i == 0) {
					if (j == 0) {
						temp = A[i][j];
					}
					if (j < N - 1) {
						A[i][j] = A[i][j + 1];
					}
				}
				else if (i > 0 && i < M - 1) {

					if (j == 0) {						
							int temp2 = A[i][0];
							A[i][0] = temp;
							temp = temp2;
					}
					if (j == N - 1) {
						A[i - 1][N - 1] = A[i][N - 1];
					}

				}

				else if (i == M - 1) {

					if (j < N - 1) {
						int temp2 = A[i][j];
						A[i][j] = temp;
						temp = temp2;
					}
					else if (j == N - 1) {
						int temp2 = A[i][j];
						A[i][j] = temp;
						A[i - 1][j] = temp2;
					}

				}

			}

		}


		AlgoMatrixRotation.printIntMatrix(A);

		in.close();

	}

	/**
	 * @param m
	 */
	public static void printIntMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

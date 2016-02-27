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

		for (int i = 0; i < R; i++) {
			A = rotate(M, N, A);
		}

		AlgoMatrixRotation.printIntMatrix(A);
		in.close();

	}

	/**
	 * This function rotates the matrix to the left one time
	 * 
	 * @param M
	 * @param N
	 * @param A
	 * @return rotated matrix
	 */
	public static int[][] rotate(int M, int N, int[][] A) {

		int layers = M < N ? M / 2 : N / 2;

		for (int k = 0; k < layers; k++) {

			Integer temp = null;

			for (int i = k; i < M - k; i++) {

				for (int j = k; j < N - k; j++) {

					if (i == k) {
						if (j == k) {
							temp = A[i][j];
						}
						if (j < N - 1 - k) {
							A[i][j] = A[i][j + 1];
						}

					} else if (i > k && i < M - 1 - k) {

						if (j == k) {
							int temp2 = A[i][k];
							A[i][k] = temp;
							temp = temp2;
						}
						if (j == N - 1 - k) {
							A[i - 1][N - 1 - k] = A[i][N - 1 - k];
						}

					} else if (i == M - 1 - k) {
						if (j < N - 1 - k) {
							int temp2 = A[i][j];
							A[i][j] = temp;
							temp = temp2;
						} else if (j == N - 1 - k) {
							int temp2 = A[i][j];
							A[i][j] = temp;
							A[i - 1][j] = temp2;
						}
					}

				}

			}

		}

		return A;

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

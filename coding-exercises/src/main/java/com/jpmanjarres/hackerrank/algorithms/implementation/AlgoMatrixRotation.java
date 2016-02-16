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

		int layers = M<N ? M/2 : N/2;

		System.out.println("Layers : "+layers);


		for(int i=0; i< layers; i++){

		}




		AlgoMatrixRotation.printIntMatrix(A);



		in.close();
	}


	/**
	 * @param m
	 */
	public static void printIntMatrix(int[][] m){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}


}

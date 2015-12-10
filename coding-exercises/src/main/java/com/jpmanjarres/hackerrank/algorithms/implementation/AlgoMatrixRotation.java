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
		
		
		
		in.close();
	}

}

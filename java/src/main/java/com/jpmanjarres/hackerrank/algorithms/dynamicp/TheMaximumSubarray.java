package com.jpmanjarres.hackerrank.algorithms.dynamicp;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 27/11/2015
 *
 */
public class TheMaximumSubarray {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int[] ar = new int[N];
			for (int j = 0; j < N; j++) {
				ar[j] = in.nextInt();
			}
			System.out.print(maxSumContiguous(ar)+" ");
			System.out.println(maxSumNonContiguous(ar));
		}

		in.close();
	}

	public static int maxSumContiguous(int[] arr){
		int maxSoFar = arr[0];
		int maxEndingHere=maxSoFar;

		for (int i = 1; i < arr.length; i++) {
			maxEndingHere =  Math.max(maxEndingHere+arr[i], arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static int maxSumNonContiguous(int[] arr){
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if(sum<0 && sum < arr[i]){
				sum = arr[i];
			}else if(arr[i]>0){
				sum+=arr[i];
			}
		}
		return sum;
	}

}

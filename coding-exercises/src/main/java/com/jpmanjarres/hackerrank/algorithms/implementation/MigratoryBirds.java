/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 22/03/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 * 22/03/2017
 *
 */
public class MigratoryBirds {

	public static void main(String[] args) {

		final Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] freq = new int[5];

		for (int z = 0; z < n; z++) {
			freq[in.nextInt()-1]++;
		}

		int minId = 0;
		int max = freq[0];
		for(int i=1; i<5; i++){
			if(freq[i] > max){
				minId = i;
				max = freq[i];
			}
		}

		System.out.println(minId+1);
		in.close();
	}

}

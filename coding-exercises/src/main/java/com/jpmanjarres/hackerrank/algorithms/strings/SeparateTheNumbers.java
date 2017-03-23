/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 23/03/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 * 23/03/2017
 *
 */
public class SeparateTheNumbers {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int q = in.nextInt();
		for (int _i = 0; _i < q; _i++) {

			String s = in.next();

			for(int j=1; j< s.length()/2; j++){

				boolean isBeautiful = true;

				for(int i=0; i<s.length()-1; i++){

					int a = (int)s.charAt(i);
					int b = (int)s.charAt(i+1);




				}

			}




		}
		in.close();
	}

	static int getInt(char[] arr, int start, int end){
		char[] nArr = Arrays.copyOfRange(arr, start, end);
		return Integer.valueOf(new String(nArr));
	}


}

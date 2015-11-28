/**
 * Date: 27/11/2015
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 27/11/2015
 *
 */
public class FunnyString {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int i = 0; i < T; i++) {

			String S = in.next();
			String R = new StringBuilder(S).reverse().toString();

			boolean funny = true;

			for (int j = 1; j < S.length(); j++) {
				int val = Math.abs((int)S.charAt(j) - (int)S.charAt(j-1));
				int val2 = Math.abs((int)R.charAt(j) - (int)R.charAt(j-1));

				if(val != val2){
					funny = false;
					break;
				}
			}
			System.out.println(funny?"Funny":"Not Funny");
		}
		in.close();
	}

}

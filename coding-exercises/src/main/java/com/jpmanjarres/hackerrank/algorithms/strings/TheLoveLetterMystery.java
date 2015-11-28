/**
 *
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 27/11/2015
 *
 */
public class TheLoveLetterMystery {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 0; i < N; i++) {

			String s = in.next();
			int len = s.length();
			int index = -1;
			
			System.out.println(len);

		}
		in.close();
	}

	public static boolean isPalindrome(String s) {
		int len = s.length();
		boolean palindrome = true;
		for (int j = 0, k = len - 1; j < s.length() / 2; j++, k--) {
			if (s.charAt(j) != s.charAt(k)) {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

}

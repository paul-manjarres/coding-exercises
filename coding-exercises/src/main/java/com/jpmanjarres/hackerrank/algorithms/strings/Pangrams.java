/**
 * Date: 27/11/2015
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 27/11/2015
 *
 */
public class Pangrams {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		String s = in.nextLine().toLowerCase();

		boolean[] alphabet = new boolean[26];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				alphabet[c - 97] = true;
			}
		}
		boolean isPangram = true;
		for (boolean b : alphabet) {
			if (!b) {
				isPangram = false;
			}
		}

		System.out.println(isPangram ? "pangram" : "not pangram");

		in.close();
	}

}

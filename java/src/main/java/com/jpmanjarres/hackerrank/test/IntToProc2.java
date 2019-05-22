/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 6/04/2017
 *
 */
package com.jpmanjarres.hackerrank.test;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         6/04/2017
 *
 */
public class IntToProc2 {

	static int differentTeams(String skills) {

		if (skills.length() < 5) {
			return 0;
		}
		int[] letters = new int[26];
		for (int i = 0; i < skills.length(); i++) {
			char c = skills.charAt(i);
			letters[c - 'a']++;
		}

		int max = skills.length() / 5;
		char[] sk = { 'p', 'c', 'm', 'b', 'z' };

		for (int j = 0; j < sk.length; j++) {
			if (letters[sk[j] - 'a'] < max) {
				max = letters[sk[j] - 'a'];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(differentTeams("pcmpcmbbbzz"));

	}

}

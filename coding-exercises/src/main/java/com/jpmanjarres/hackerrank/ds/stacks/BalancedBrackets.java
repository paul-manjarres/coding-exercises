/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 16/03/2017
 *
 */
package com.jpmanjarres.hackerrank.ds.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         16/03/2017
 *
 */
public class BalancedBrackets {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int z = 0; z < N; z++) {

			final String s = in.next();
			final Deque<Character> stack = new ArrayDeque<>();


			boolean valid = true;

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				if (c == '[' || c == '{' || c == '(') {
					stack.push(c);
				} else {
					if (stack.isEmpty()) {
						valid = false;
						break;
					}
					char p = stack.pop();

					if (c == '}' && p != '{') {
						valid = false;
						break;
					} else if (c == ']' && p != '[') {
						valid = false;
						break;
					} else if (c == ')' && p != '(') {
						valid = false;
						break;
					}

				}
			}

			if(!stack.isEmpty()){
				valid = false;
			}

			System.out.println(valid?"YES":"NO");

		}
		in.close();
	}

}

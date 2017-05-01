/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 30/04/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         30/04/2017
 *
 */
public class ManasaAndStones {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int _i = 0; _i < t; _i++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			Deque<Integer> queue = new ArrayDeque<>();
			queue.addLast(0);

			for (int i = 0; i < n - 1; i++) {

				int pow = (int) Math.pow(2, i);
				for (int j = 0; j < pow; j++) {
					int x = queue.poll();
					queue.addLast(x + a);
					queue.addLast(x + b);
				}

			}

			List<Integer> list = new ArrayList<>(new HashSet<Integer>(queue));

			Collections.sort(list);
			int size = list.size();
			for (int i = 0; i < size; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();

		}
		in.close();
	}

}

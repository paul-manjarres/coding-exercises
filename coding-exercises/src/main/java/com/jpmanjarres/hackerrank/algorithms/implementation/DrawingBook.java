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
 *         22/03/2017
 *
 */
public class DrawingBook {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int p = in.nextInt();
		int fromStart = p /2;
		int fromEnd = (n-p)/2;
		System.out.println(Math.min(fromStart, fromEnd));
		in.close();
	}

}

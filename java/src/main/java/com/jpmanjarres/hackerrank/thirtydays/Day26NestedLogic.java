/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 9/03/2017
 *
 */
package com.jpmanjarres.hackerrank.thirtydays;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         9/03/2017
 *
 */
public class Day26NestedLogic {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int retDay = in.nextInt();
		int retMonth = in.nextInt();
		int retYear = in.nextInt();

		int expDay = in.nextInt();
		int expMonth = in.nextInt();
		int expYear = in.nextInt();


		int fine = 0;

		if (retYear > expYear) {
			fine = 10000;
		} else if (retYear < expYear) {
			fine = 0;

		} else {
			if (retMonth > expMonth) {
				fine = 500 * (retMonth - expMonth);
			} else if (retDay > expDay) {
				fine = 15 * (retDay - expDay);
			}
		}

		System.out.println(fine);

		in.close();
	}

}

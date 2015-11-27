package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 26/11/2015
 *
 */
public class TaumAndBday {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		for (int i = 0; i < T; i++) {

			long B = in.nextLong();
			long W = in.nextLong();

			long X = in.nextLong();
			long Y = in.nextLong();
			long Z = in.nextLong();

			long fullPrice = B * X + W * Y;

			if (Z + Y < X) {
				long price = (B * (Z + Y)) + (W * Y);
				if (price < fullPrice) {
					System.out.println(price);
					continue;
				}
			}

			if (Z + X < Y) {
				long price = (B * X) + (W * (Z + X));
				if (price < fullPrice) {
					System.out.println(price);
					continue;
				}
			}

			System.out.println(fullPrice);

		}

		in.close();
	}

}

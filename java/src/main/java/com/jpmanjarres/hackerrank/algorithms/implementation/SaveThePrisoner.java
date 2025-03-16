/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 10/04/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     10/04/2017
 */
public class SaveThePrisoner {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int _i = 0; _i < t; _i++) {
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();

            long index = 0;
            if (s == 1) {
                index = m % n;
            } else {
                index = ((m % n) + s - 1) % n;
            }

            System.out.println(index != 0 ? index : n);
        }
        in.close();
    }
}

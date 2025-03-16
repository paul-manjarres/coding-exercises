/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 8/03/2017
 */
package com.jpmanjarres.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     8/03/2017
 */
public class Day25RunningTimeAndComplexity {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {

            int j = in.nextInt();
            System.out.println(isPrime(j) ? "Prime" : "Not prime");
        }
        in.close();
    }

    /**
     * Check if number is prime
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        int sqrt = (int) Math.floor(Math.sqrt(n));
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

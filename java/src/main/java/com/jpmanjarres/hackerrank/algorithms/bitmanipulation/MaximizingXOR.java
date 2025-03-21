/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 21/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     21/03/2017
 */
public class MaximizingXOR {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int r = in.nextInt();

        int pow = Integer.toBinaryString(l ^ r).length();
        System.out.println(Math.pow(2, pow) - 1);

        in.close();
    }
}

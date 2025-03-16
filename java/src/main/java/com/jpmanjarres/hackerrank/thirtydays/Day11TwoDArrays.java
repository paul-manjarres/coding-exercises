/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 10/03/2017
 */
package com.jpmanjarres.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     10/03/2017
 */
public class Day11TwoDArrays {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        // Read array
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        // Process

        int max = -9999;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j]
                        + arr[i][j + 1]
                        + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j]
                        + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}

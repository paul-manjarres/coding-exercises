/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 9/03/2017
 */
package com.jpmanjarres.hackerrank.thirtydays;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     9/03/2017
 */
public class Day17MoreExceptions {

    int power(int n, int p) {

        if (n < 0 || p < 0) {
            throw new RuntimeException("n and p should be non-negative");
        }

        return (int) Math.pow(n, p);
    }
}

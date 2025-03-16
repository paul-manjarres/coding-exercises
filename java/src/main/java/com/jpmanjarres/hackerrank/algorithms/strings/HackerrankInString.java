/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 23/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     23/03/2017
 */
public class HackerrankInString {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        char[] word = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};

        for (int _i = 0; _i < q; _i++) {
            String s = in.next();
            int idx = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == word[idx]) {
                    idx++;
                }
                if (idx == word.length) {
                    break;
                }
            }
            System.out.println(idx == word.length ? "YES" : "NO");
        }
        in.close();
    }
}

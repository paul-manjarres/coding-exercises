/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 22/03/2017
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     22/03/2017
 */
public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }

        String word = in.next();
        int width = word.length();
        int height = 0;
        for (int i = 0; i < word.length(); i++) {
            height = Math.max(height, h[word.charAt(i) - 'a']);
        }
        System.out.println(height * width);
        in.close();
    }
}

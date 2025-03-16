/** */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 27/11/2015
 */
public class TwoStrings {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String s = in.next();
            String t = in.next();
            boolean flag = false;

            int[] countA = new int[26];
            int[] countB = new int[26];
            for (int j = 0; j < s.length(); j++) {
                countA[s.charAt(j) - 97]++;
            }
            for (int j = 0; j < t.length(); j++) {
                countB[t.charAt(j) - 97]++;
            }

            for (int j = 0; j < 26 && !flag; j++) {
                flag = countA[j] > 0 && countB[j] > 0;
            }

            //			for (int j = 0; j < s.length()&& !flag; j++) {
            //				char c = s.charAt(j);
            //				for (int k = 0; k < t.length() && !flag; k++) {
            //					flag = (c == t.charAt(k));
            //				}
            //			}
            System.out.println(flag ? "YES" : "NO");
        }
        in.close();
    }
}

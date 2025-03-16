/** */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 27/11/2015
 */
public class Anagram {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String s = in.next();
            int len = s.length();

            if (len % 2 == 1) {
                System.out.println("-1");
                continue;
            }

            int[] countA = new int[26];
            int[] countB = new int[26];
            for (int j = 0; j < len / 2; j++) {
                countA[s.charAt(j) - 97]++;
                countB[s.charAt(j + len / 2) - 97]++;
            }
            int changes = 0;
            for (int j = 0; j < 26; j++) {
                if (countA[j] != countB[j]) {
                    changes += Math.abs(countA[j] - countB[j]);
                }
            }
            System.out.println(changes / 2);
        }
        in.close();
    }
}

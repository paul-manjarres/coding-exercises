package com.jpmanjarres.hackerrank.algorithms.search;


import java.util.*;

/**
 * Hackerland Radio Transmitters https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
public class HackerlandRadioTransmitters {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int k = in.nextInt();
        final int[] x = new int[n];

        final int k2 = k * 2;

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }

        Arrays.sort(x);
        int i = 0;
        int count = 0;

        while (i < n) {

            int c = x[i];
            int curr = c;

            while (curr < c + k && i < n - 1) {
                curr = x[++i];
            }

            count++;
            if(curr > c+k){
                continue;
            }

            while (curr < c + k2 && i < n - 1) {
                curr = x[++i];
            }
            i++;
        }
        System.out.println(count);
    }
}

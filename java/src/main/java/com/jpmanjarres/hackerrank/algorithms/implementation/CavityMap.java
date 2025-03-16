package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class CavityMap {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            // Read the Grid
            int[][] G = new int[n][n];
            for (int j = 0; j < n; j++) {
                String line = in.next();
                for (int k = 0; k < n; k++) {
                    G[j][k] = Character.getNumericValue(line.charAt(k));
                }
            }

            // Find cavities
            final boolean[][] C = new boolean[n][n];
            for (int j = 1; j < n - 1; j++) {
                for (int k = 1; k < n - 1; k++) {
                    int val = G[j][k];
                    if (val > G[j - 1][k] && val > G[j][k - 1] && val > G[j + 1][k] && val > G[j][k + 1]) {
                        C[j][k] = true;
                    }
                }
            }

            // Print
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    if (C[j][j2]) {
                        System.out.print("X");
                    } else {
                        System.out.print(G[j][j2]);
                    }
                }
                System.out.println();
            }
        }
        in.close();
    }
}

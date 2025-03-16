package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class TheGridSearch {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int R = in.nextInt();
            int C = in.nextInt();

            // Read the Grid
            int[][] G = new int[R][C];
            for (int j = 0; j < R; j++) {
                String line = in.next();
                for (int k = 0; k < C; k++) {
                    G[j][k] = Character.getNumericValue(line.charAt(k));
                }
            }

            int r = in.nextInt();
            int c = in.nextInt();

            // Read the Pattern
            int[][] P = new int[r][c];
            for (int j = 0; j < r; j++) {
                String line = in.next();
                for (int k = 0; k < c; k++) {
                    P[j][k] = Character.getNumericValue(line.charAt(k));
                }
            }

            final List<int[]> possibilites = new ArrayList<>();
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < C; k++) {
                    if (G[j][k] == P[0][0]
                            && R - j >= r
                            && C - k >= c
                            && G[j + r - 1][k] == P[r - 1][0]
                            && G[j][k + c - 1] == P[0][c - 1]
                            && G[j + r - 1][k + c - 1] == P[r - 1][c - 1]) {
                        possibilites.add(new int[] {j, k});
                    }
                }
            }

            boolean found = true;
            if (possibilites.isEmpty()) {
                found = false;
            }

            // Check for all possibilities
            for (int[] a : possibilites) {
                found = true;
                for (int j = 0; j < r && found; j++) {
                    for (int k = 0; k < c; k++) {
                        if (G[j + a[0]][k + a[1]] != P[j][k]) {
                            found = false;
                        }
                    }
                }

                if (found) {
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
        in.close();
    }
}

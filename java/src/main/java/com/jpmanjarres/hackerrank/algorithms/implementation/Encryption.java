package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 26/11/2015
 */
public class Encryption {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        String s = in.next();

        double sqrt = Math.sqrt(s.length());

        int lowerSqrt = (int) Math.floor(sqrt);
        int upperSqrt = (int) Math.ceil(sqrt);

        int rows = lowerSqrt;
        int cols = upperSqrt;

        int minArea = s.length() * s.length();

        while (rows <= upperSqrt && cols <= upperSqrt) {
            if (rows * cols >= s.length() && rows * cols < minArea) {
                minArea = rows * cols;
                break;
            } else {
                if (rows < cols) {
                    rows++;
                } else {
                    cols++;
                }
            }
        }

        char[][] G = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                if (index < s.length()) {
                    G[i][j] = s.charAt(i * cols + j);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (Character.isAlphabetic(G[j][i])) {
                    sb.append(G[j][i]);
                }
            }
            sb.append(" ");
        }

        System.out.println(sb);

        in.close();
    }
}

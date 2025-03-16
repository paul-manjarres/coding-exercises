package com.jpmanjarres.hackerrank.algorithms.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

    // Complete the gridChallenge function below.
    static String gridChallenge(String[] grid) {

        char[][] sortedGrid = new char[grid.length][grid[0].length()];

        for (int i = 0; i < grid.length; i++) {
            String s = grid[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            for (int j = 0; j < arr.length; j++) {
                sortedGrid[i][j] = arr[j];
            }
        }

        for (int i = 0; i < sortedGrid[0].length; i++) {
            for (int j = 0; j < sortedGrid.length - 1; j++) {
                if (sortedGrid[j][i] > sortedGrid[j + 1][i]) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                String gridItem = scanner.next();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);
            System.out.println(result);
        }

        scanner.close();
    }
}

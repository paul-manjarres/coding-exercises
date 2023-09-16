package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 9/12/2015
 */
public class AlgoMatrixRotation {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int M = in.nextInt();
    int N = in.nextInt();
    int R = in.nextInt();

    int[][] A = new int[M][N];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        A[i][j] = in.nextInt();
      }
    }

    A = rotate(M, N, R, A);
    AlgoMatrixRotation.printIntMatrix(A);

    in.close();
  }

  /**
   * This function rotates the matrix to the left R time
   *
   * @param M
   * @param N
   * @param R number of rotations
   * @param A matrix
   * @return rotated matrix
   */
  public static int[][] rotate(int M, int N, int R, int[][] A) {

    int layers = M < N ? M / 2 : N / 2;

    boolean left = false;

    for (int k = 0; k < layers; k++) {

      int numberOfRotationsTillGetTheOriginal = 2 * (M - 2 * k) + 2 * (N - 2 - 2 * k);
      int totalRotations = R % numberOfRotationsTillGetTheOriginal;

      int halfRotation = numberOfRotationsTillGetTheOriginal / 2;

      if (totalRotations <= halfRotation) {
        left = true;
      } else {
        left = false;
        totalRotations = numberOfRotationsTillGetTheOriginal - totalRotations;
      }

      // System.out.println("elements: " + numberOfRotationsTillGetTheOriginal);
      // System.out.println("Layer: "+k+" - Total rotations: " + totalRotations+" -
      // "+(left?"Left":"Right"));

      for (int z = 0; z < totalRotations; z++) {

        if (left) {
          A = rotateLayerToLeft(M, N, k, A);
        } else {
          A = rotateLayerToRight(M, N, k, A);
        }
      }
    }

    return A;
  }

  /**
   * @param M
   * @param N
   * @param k
   * @param A
   * @return
   */
  public static int[][] rotateLayerToLeft(int M, int N, int k, int[][] A) {

    Integer temp = null;
    Integer last = null;

    for (int i = k; i < M - k; i++) {

      for (int j = k; j < N - k; j++) {

        // Process first and last row in the layer
        if (i == k) {
          if (j == k) {

            last = A[M - 1 - k][j];
            A[M - 1 - k][j] = A[M - 2 - k][j];

            temp = A[i][j];
            A[i][j] = A[i][j + 1];

          } else if (j > k && j < N - 1 - k) {
            A[i][j] = A[i][j + 1];

            int temp2 = A[M - 1 - k][j];
            A[M - 1 - k][j] = last;
            last = temp2;

          } else if (j == N - 1 - k) {

            int temp2 = A[M - 1 - k][j];
            A[M - 1 - k][j] = last;
            last = temp2;
          }
        }

        // process intermediate rows
        else if (i > k && i < M - 1 - k) {

          if (j == k) {
            int temp2 = A[i][k];
            A[i][k] = temp;
            temp = temp2;

            A[i - 1][N - 1 - k] = A[i][N - 1 - k];
          }
        }
      }
    }
    A[M - k - 2][N - 1 - k] = last;

    return A;
  }

  /**
   * @param M
   * @param N
   * @param k
   * @param A
   * @return
   */
  public static int[][] rotateLayerToRight(int M, int N, int k, int[][] A) {

    Integer temp = null;
    Integer last = null;

    for (int i = k; i < M - k; i++) {

      for (int j = N - k - 1; j >= k; j--) {

        // Process first and last row in the layer
        if (i == k) {
          if (j == N - 1 - k) {
            last = A[M - 1 - k][j];
            A[M - 1 - k][j] = A[M - 2 - k][j];

            temp = A[i][j];
            A[i][j] = A[i][j - 1];

          } else if (j > k && j < N - 1 - k) {
            A[i][j] = A[i][j - 1];

            int temp2 = A[M - 1 - k][j];
            A[M - 1 - k][j] = last;
            last = temp2;

          } else if (j == k) {

            int temp2 = A[M - 1 - k][j];
            A[M - 1 - k][j] = last;
            last = temp2;
          }
        }

        // process intermediate rows
        else if (i > k && i < M - 1 - k) {

          if (j == N - 1 - k) {
            int temp2 = A[i][N - 1 - k];
            A[i][N - 1 - k] = temp;
            temp = temp2;

            A[i - 1][k] = A[i][k];
          }
        }
      }
    }
    A[M - k - 2][k] = last;

    return A;
  }

  /**
   * @param m
   */
  public static void printIntMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + "\t");
      }
      System.out.println();
    }
  }
}

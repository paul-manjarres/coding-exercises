package com.jpmanjarres.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 03/10/2016
 */
public class CircularArrayRotationEasy {

  /**
   * @param A
   * @return
   */
  public static int[] rotateLeft(int[] A) {
    int l = A.length;
    int first = A[0];
    for (int j = 0; j < A.length - 1; j++) {
      A[j] = A[j + 1];
    }
    A[l - 1] = first;
    return A;
  }

  /**
   * @param A
   * @return
   */
  public static int[] rotateRight(int[] A) {
    int l = A.length;
    int last = A[l - 1];
    int temp = A[0];

    for (int j = 1; j < A.length; j++) {
      int temp2 = A[j];
      A[j] = temp;
      temp = temp2;
    }
    A[0] = last;
    return A;
  }

  /**
   * @param A
   * @param k
   * @return
   */
  public static int[] rotate(int[] A, int k) {

    if (k <= 0) {
      return A;
    }

    int l = A.length;
    int effective_rotations = k;
    boolean right = true;

    if (k > l) {
      effective_rotations = k % l;
    }
    if (k > l / 2) {
      right = false;
      effective_rotations = l - effective_rotations;
    }

    for (int i = 0; i < effective_rotations; i++) {
      if (right) {
        rotateRight(A);
      } else {
        rotateLeft(A);
      }
    }

    return A;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int K = in.nextInt();
    int Q = in.nextInt();

    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
    }

    A = rotate(A, K);

    for (int i = 0; i < Q; i++) {
      int index = in.nextInt();
      System.out.println(A[index]);
    }

    in.close();
  }
}

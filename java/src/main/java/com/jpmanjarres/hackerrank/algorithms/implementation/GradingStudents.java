package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

  static int[] solve(int[] grades) {
    for (int i = 0; i < grades.length; i++) {
      if (grades[i] >= 38) {
        int diff = (5 - grades[i] % 5);

        if (diff < 3) {
          grades[i] = grades[i] + diff;
        }
      }
    }
    return grades;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] grades = new int[n];
    for (int grades_i = 0; grades_i < n; grades_i++) {
      grades[grades_i] = in.nextInt();
    }
    int[] result = solve(grades);
    for (int grades_i = 0; grades_i < n; grades_i++) {
      System.out.println(result[grades_i]);
    }
    in.close();
  }
}

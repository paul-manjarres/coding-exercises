package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class LibraryFine {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int da = in.nextInt();
    int ma = in.nextInt();
    int ya = in.nextInt();
    int de = in.nextInt();
    int me = in.nextInt();
    int ye = in.nextInt();

    int fine = 0;

    if (ya > ye) {
      fine = 10000;
    } else if (ya < ye) {
      fine = 0;
    } else if (ma > me) {
      fine = 500 * (ma - me);
    } else if (ma < me) {
      fine = 0;
    } else {
      fine = 15 * (da - de);
      fine = fine < 0 ? 0 : fine;
    }

    System.out.println(fine);
    in.close();
  }
}

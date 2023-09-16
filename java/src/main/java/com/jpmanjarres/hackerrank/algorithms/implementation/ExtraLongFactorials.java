package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class ExtraLongFactorials {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    BigInteger bi = BigInteger.valueOf(n);

    for (int i = n - 1; i > 1; i--) {
      bi = bi.multiply(BigInteger.valueOf(i));
    }
    System.out.println(bi.toString());
    in.close();
  }
}

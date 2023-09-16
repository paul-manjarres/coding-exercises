package com.jpmanjarres.hackerrank.thirtydays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     8/03/2017
 */
public class Day10BinaryNumbers {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    String bin = toBynaryString(n);
    String maxOnes = findMaxConsecutiveNumber(bin);
    System.out.println(maxOnes.length());

    in.close();
  }

  public static String findMaxConsecutiveNumber(String bin) {

    if (bin == null || bin.length() == 0) {
      return "0";
    }

    int count = 0;
    int max = 0;

    for (int i = 0; i < bin.length(); i++) {

      if (bin.charAt(i) == '1') {
        count++;
      } else {
        if (count > max) {
          max = count;
        }
        count = 0;
      }
    }

    if (count > max) {
      max = count;
    }

    final char[] ones = new char[max];
    Arrays.fill(ones, '1');
    return new String(ones);
  }

  public static String toBynaryString(int n) {

    if (n == 0 || n == 1) {
      return Integer.toString(n);
    }

    StringBuilder bynaryString = new StringBuilder();

    while (n > 0) {
      int mod = n % 2;
      bynaryString.append(mod);
      n = n / 2;
    }
    return bynaryString.reverse().toString();
  }
}

package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class CaesarCipher {

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {

      int n = in.nextInt();
      String s = in.next();
      int k = in.nextInt();

      StringBuilder encoded = new StringBuilder();

      for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        int rot = k % 26;
        if (Character.isAlphabetic(c)) {
          if (Character.isUpperCase(c) && (c + rot > 90)
              || Character.isLowerCase(c) && (c + rot > 122)) {
            c = (char) (c + rot - 26);
          } else {
            c = (char) (c + rot);
          }
        }
        encoded.append(c);
      }

      System.out.println(encoded);
    }
  }
}

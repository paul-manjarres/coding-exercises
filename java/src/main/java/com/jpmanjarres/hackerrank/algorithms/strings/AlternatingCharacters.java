/** Date: 27/11/2015 */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 27/11/2015
 */
public class AlternatingCharacters {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      String s = in.next();
      int deletes = 0;

      for (int j = 0; j < s.length() - 1; j++) {
        char c = s.charAt(j);
        char d = s.charAt(j + 1);

        if (c == d) {
          deletes++;
        }
      }
      System.out.println(deletes);
    }
    in.close();
  }
}

/** */
package com.jpmanjarres.hackerrank.algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 2/12/2015
 */
public class SherlockAndValidString {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);
    String S = in.next();

    int[] letters = new int[26];

    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      letters[c - 97]++;
    }

    Map<Integer, Integer> freq = new HashMap<>();

    for (int i = 0; i < letters.length; i++) {
      if (letters[i] != 0) {
        Integer val = freq.get(letters[i]);
        if (val != null) {
          val++;
          freq.put(letters[i], val);
        } else {
          freq.put(letters[i], 1);
        }
      }
    }

    if (freq.size() > 2) {
      System.out.println("NO");
    } else if (freq.size() == 1) {
      System.out.println("YES");
    } else {

      int[][] freq2 = new int[2][2];
      int i = 0;

      for (Entry<Integer, Integer> entry : freq.entrySet()) {
        freq2[i][0] = entry.getKey();
        freq2[i][1] = entry.getValue();
        i++;
      }

      int biggerIndex = freq2[0][0] > freq2[1][0] ? 0 : 1;
      int lowerIndex = freq2[0][0] < freq2[1][0] ? 0 : 1;

      if (freq2[lowerIndex][0] == 1 && freq2[lowerIndex][1] == 1) {
        System.out.println("YES");
      } else if (freq2[biggerIndex][0] - freq2[lowerIndex][0] == 1 && freq2[biggerIndex][1] == 1) {
        System.out.println("YES");

      } else {
        System.out.println("NO");
      }
    }

    in.close();
  }
}

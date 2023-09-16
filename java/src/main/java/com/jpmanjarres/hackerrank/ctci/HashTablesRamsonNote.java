/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 17/03/2017
 */
package com.jpmanjarres.hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     17/03/2017
 */
public class HashTablesRamsonNote {

  Map<String, Integer> magazineMap;
  Map<String, Integer> noteMap;

  public HashTablesRamsonNote(String magazine, String note) {

    magazineMap = new HashMap<>();
    noteMap = new HashMap<>();

    for (String s : magazine.split(" ")) {
      Integer val = magazineMap.get(s);
      if (val == null) {
        val = 0;
      }
      val++;
      magazineMap.put(s, val);
    }

    for (String s : note.split(" ")) {
      Integer val = noteMap.get(s);
      if (val == null) {
        val = 0;
      }
      val++;
      noteMap.put(s, val);
    }
  }

  public boolean solve() {
    for (Entry<String, Integer> entry : noteMap.entrySet()) {
      Integer val = entry.getValue();
      String s = entry.getKey();
      if (magazineMap.get(s) < val) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();

    // Eat whitespace to beginning of next line
    scanner.nextLine();

    HashTablesRamsonNote s = new HashTablesRamsonNote(scanner.nextLine(), scanner.nextLine());
    scanner.close();

    boolean answer = s.solve();
    if (answer) System.out.println("Yes");
    else System.out.println("No");
  }
}

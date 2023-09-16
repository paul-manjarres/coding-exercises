/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 10/03/2017
 */
package com.jpmanjarres.hackerrank.thirtydays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     10/03/2017
 */
public class Day28Regex {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    final Pattern p = Pattern.compile("[a-z]+@gmail.com");
    final List<String> names = new ArrayList<>();

    int N = in.nextInt();
    for (int i = 0; i < N; i++) {

      String name = in.next();
      String email = in.next();

      Matcher m = p.matcher(email);

      if (m.find()) {
        names.add(name);
      }
    }

    Collections.sort(names);

    for (String s : names) {
      System.out.println(s);
    }

    in.close();
  }
}

/** */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 16/11/2015
 */
public class FindDigits {

  public static void main(String[] args) {
    final PrintWriter out = new PrintWriter(System.out);
    final InputReader in = new InputReader(System.in);
    // PROBLEM SOLVING

    int t = in.nextInt();

    for (int i = 0; i < t; i++) {

      String n = in.next();
      int[] digitCount = new int[10];

      long number = Long.parseLong(n);
      int count = 0;

      for (int j = 0; j < n.length(); j++) {
        int digit = Integer.parseInt("" + n.charAt(j));
        digitCount[digit] += 1;
      }

      for (int j = 1; j < 10; j++) {
        if (number % j == 0) {
          count += digitCount[j];
        }
      }
      out.println(count);
    }

    out.close();
  }

  static class InputReader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    public InputReader(InputStream is) {
      reader = new BufferedReader(new InputStreamReader(is), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}

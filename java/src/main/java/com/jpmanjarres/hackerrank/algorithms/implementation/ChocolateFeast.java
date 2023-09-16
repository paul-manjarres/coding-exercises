/** */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 25/11/2015
 */
public class ChocolateFeast {

  public static void main(String[] args) {
    final PrintWriter out = new PrintWriter(System.out);
    final InputReader in = new InputReader(System.in);
    // PROBLEM SOLVING

    int t = in.nextInt();

    for (int i = 0; i < t; i++) {

      int n = in.nextInt();
      int c = in.nextInt();
      int m = in.nextInt();

      int buy = n / c;
      int wrappers = buy;

      while (wrappers >= m) {
        int candy = wrappers / m;
        wrappers = (wrappers % m) + candy;
        buy += candy;
      }
      out.println(buy);
    }
    out.close();
  }

  // Utility class for input parsing
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

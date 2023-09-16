package com.jpmanjarres.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 13/11/2015
 */
public class DiagonalDifference {

  public static void main(String[] args) {
    final PrintWriter out = new PrintWriter(System.out);
    final InputReader in = new InputReader(System.in);
    // PROBLEM SOLVING

    int n = in.nextInt();

    int sumMain = 0;
    int sumSec = 0;
    int row = 0;

    int length = n * n;

    for (int i = 0; i < length; i++) {
      int val = in.nextInt();

      if (i > row * n + n - 1) {
        row++;
      }
      if (i == (row * n + row)) {
        sumMain += val;
      }
      if (i == (row * n + n - row - 1)) {
        sumSec += val;
      }
    }

    out.println(Math.abs(sumMain - sumSec));
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

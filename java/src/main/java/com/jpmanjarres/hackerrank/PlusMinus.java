/** */
package com.jpmanjarres.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 15/11/2015
 */
public class PlusMinus {

  public static void main(String[] args) {
    final PrintWriter out = new PrintWriter(System.out);
    final InputReader in = new InputReader(System.in);
    // PROBLEM SOLVING

    int n = in.nextInt();

    double positives = 0.0;
    double negatives = 0.0;
    double zeroes = 0.0;

    for (int i = 0; i < n; i++) {
      int val = in.nextInt();

      if (val > 0) {
        positives += (1 / (double) n);
      } else if (val < 0) {
        negatives += (1 / (double) n);
      } else {
        zeroes += (1 / (double) n);
      }
    }

    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);
    df.setMinimumFractionDigits(3);
    out.println(df.format(positives));
    out.println(df.format(negatives));
    out.println(df.format(zeroes));
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

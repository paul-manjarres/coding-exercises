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
public class UtopianTree {

    public static void main(String[] args) {
        final PrintWriter out = new PrintWriter(System.out);
        final InputReader in = new InputReader(System.in);
        // PROBLEM SOLVING

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int cicles = in.nextInt();
            out.println(raiseHeight(1, 1, cicles));
        }
        out.close();
    }

    static int raiseHeight(int height, int currentCicle, int cicles) {
        if (currentCicle > cicles) {
            return height;
        }
        if (currentCicle % 2 == 1) {
            return raiseHeight(height * 2, currentCicle + 1, cicles);
        } else if (currentCicle % 2 == 0) {
            return raiseHeight(height + 1, currentCicle + 1, cicles);
        } else {
            return height;
        }
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

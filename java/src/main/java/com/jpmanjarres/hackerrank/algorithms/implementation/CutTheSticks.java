/** */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 16/11/2015
 */
public class CutTheSticks {

    public static void main(String[] args) {
        final PrintWriter out = new PrintWriter(System.out);
        final InputReader in = new InputReader(System.in);
        // PROBLEM SOLVING

        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        while (list.size() > 0) {

            out.println(list.size());

            int min = list.get(0);

            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i);
                if (val < min) {
                    min = val;
                }
            }

            List<Integer> newList = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i);
                val -= min;
                if (val > 0) {
                    newList.add(val);
                }
            }
            list = newList;
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

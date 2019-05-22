/**
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 
 * 25/11/2015
 *
 */
public class ServiceLane {


	public static void main(String[] args) {
		final PrintWriter out = new PrintWriter(System.out);
		final InputReader in = new InputReader(System.in);
		//PROBLEM SOLVING

		int n = in.nextInt();
		int t = in.nextInt();
		
		int[] width= new int[n];
		
		for (int i = 0; i < n; i++) {
			width[i] = in.nextInt();			
		}
		
		for (int i = 0; i < t; i++) {
			
			int x = in.nextInt();
			int y = in.nextInt();
			
			int maxWidth= 3;
			
			for (int j = x; j <= y; j++) {
				if(width[j] < maxWidth){
					maxWidth = width[j];
				}
			}			
			out.println(maxWidth);			
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

		public long nextLong(){
			return Long.parseLong(next());
		}
	}

	
}

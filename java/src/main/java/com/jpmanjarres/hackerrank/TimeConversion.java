/**
 *
 */
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
 *
 */
public class TimeConversion {

	public static void main(String[] args) {
		final PrintWriter out = new PrintWriter(System.out);
		final InputReader in = new InputReader(System.in);
		// PROBLEM SOLVING

		String time = in.next();		
		String[] values = time.split(":");
		
		int hour=Integer.parseInt(values[0]);		
		String AMPM = values[2].substring(2, values[2].length());
			
		
		final StringBuilder newTime = new StringBuilder();
		
		final DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(0);
		df.setMinimumFractionDigits(0);
		df.setMinimumIntegerDigits(2);
		
		
		if(hour == 12){
			hour= 0;			
		}
		
		if("AM".equalsIgnoreCase(AMPM)){			
			newTime.append(df.format(hour));		
		}else if("PM".equalsIgnoreCase(AMPM)){
			newTime.append(df.format(hour+12));		
		}
		
		
		newTime.append(":");
		newTime.append(values[1]);
		newTime.append(":");
		newTime.append(values[2].substring(0,2));
		
		out.println(newTime.toString());
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

/**
 *
 */
package com.jpmanjarres;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 16 de feb. de
 *         2016
 *
 */
public class YagamiPaulUtils {

	/**
	 * @param m
	 */
	public static <T> void printMatrix(T[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println(m + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Prints a matrix of elements of type int
	 *
	 * @param m
	 */
	public static void printIntMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Reverse the string
	 *
	 * @param s
	 * @return
	 */
	public static String reverse(String s) {
		final StringBuilder sb = new StringBuilder(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}

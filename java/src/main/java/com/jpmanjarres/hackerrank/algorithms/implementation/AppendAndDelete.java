/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 1/05/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 * 1/05/2017
 *
 */
public class AppendAndDelete {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		String t = in.nextLine();
		int k = in.nextInt();

		int count =0;
		int pending = 0;
		int left = 0;

		for(int i=0; i< t.length(); i++){
			if(i<s.length() && s.charAt(i) == t.charAt(i)){
				count++;
			}else{
				pending = t.length() - i;
				break;
			}
		}



		System.out.println("count: "+count);
		System.out.println("pending: "+pending);


		if(s.length() > t.length()){
			left = s.length() - t.length();
			System.out.println("left: "+left);
			if(s.length()-left == k || 2*pending+left<=k){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}


		}

		else if(2*pending<=k){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}



		in.close();
	}
}

/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 9/03/2017
 *
 */
package com.jpmanjarres.hackerrank.thirtydays;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 * 9/03/2017
 *
 */

interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

public class Day19Interfaces implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int sum =1;
		for(int i= 2; i<=n; i++){
			if(n%i ==0){
				sum+=i;
			}
		}
		return sum;
	}


	public static void main(String[] args) {


		Day19Interfaces main = new Day19Interfaces();
		System.out.println(main.divisorSum(6));

	}

}

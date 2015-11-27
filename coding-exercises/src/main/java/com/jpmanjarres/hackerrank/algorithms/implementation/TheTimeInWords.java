package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 
 * 26/11/2015
 *
 */
public class TheTimeInWords {
	
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int H = in.nextInt();
		int M = in.nextInt();
		
		
		String[] numbers = {"","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
				"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eigth","twenty nine","thirty"};
		
		if(M == 0){
			System.out.println(numbers[H]+" o' clock");			
		}else if(M ==30){
			System.out.println("half past "+numbers[H]);
		}else if(M==15){
			System.out.println("quarter past "+numbers[H]);
		}else if(M==45){
			System.out.println("quarter to "+numbers[(H+1)%12]);
		}else if(M==1){
			System.out.println("one minute past "+numbers[H]);
		}else if(M==59){
			System.out.println("one minute to "+numbers[(H+1)%12]);
		}
		else if(M<30){
			System.out.println(numbers[M]+" minutes past "+numbers[H]);
		}else if(M>30){
			System.out.println(numbers[60-M]+" minutes to "+numbers[(H+1)%12]);
		}
			
			
			
		
		in.close();
	}

}

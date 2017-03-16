/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 15/03/2017
 *
 */
package com.jpmanjarres.hackerrank.ds.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         15/03/2017
 *
 */
public class EqualStacks {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();

		final Deque<CustomStackNode> stack1 = new ArrayDeque<>(n1);
		final Deque<CustomStackNode> stack2 = new ArrayDeque<>(n2);
		final Deque<CustomStackNode> stack3 = new ArrayDeque<>(n3);

		int[] n1data = new int[n1];
		int[] n2data = new int[n2];
		int[] n3data = new int[n3];

		for (int x = 0; x < n1; x++) {
			n1data[x] = in.nextInt();
		}
		for (int x = 0; x < n2; x++) {
			n2data[x] = in.nextInt();
		}
		for (int x = 0; x < n3; x++) {
			n3data[x] = in.nextInt();
		}

		for (int x = n1 - 1; x >= 0; x--) {
			final CustomStackNode node = new CustomStackNode(n1data[x], n1data[x]);
			if (!stack1.isEmpty()) {
				node.currentMax = n1data[x] + stack1.peek().currentMax;
			}
			stack1.push(node);
		}

		for (int x = n2 - 1; x >= 0; x--) {
			final CustomStackNode node = new CustomStackNode(n2data[x], n2data[x]);
			if (!stack2.isEmpty()) {
				node.currentMax = n2data[x] + stack2.peek().currentMax;
			}
			stack2.push(node);
		}

		for (int x = n3 - 1; x >= 0; x--) {
			final CustomStackNode node = new CustomStackNode(n3data[x], n3data[x]);
			if (!stack3.isEmpty()) {
				node.currentMax = n3data[x] + stack3.peek().currentMax;
			}
			stack3.push(node);
		}

		n1data = null;
		n2data = null;
		n3data= null;

		int maxValue = Integer.MAX_VALUE;

		while(maxValue > 0){

			int m1 = stack1.isEmpty()? 0 : stack1.peek().currentMax;
			int m2 = stack2.isEmpty()? 0 : stack2.peek().currentMax;
			int m3 = stack3.isEmpty()? 0 : stack3.peek().currentMax;

			if(m1 == m2 && m1 == m3){
				System.out.println(m1);
				break;
			}

			if(m1 > m2 && m1 > m3){
				stack1.pop();
			}else if(m2 > m1 && m2 > m3){
				stack2.pop();
			}else{
				stack3.pop();
			}
		}



		in.close();
	}

	/////////////////////////////////////////////

	static class CustomStackNode {
		int val;
		int currentMax;

		public CustomStackNode() {
		}

		public CustomStackNode(int val, int currentMax) {
			this.val = val;
			this.currentMax = currentMax;
		}

		@Override
		public String toString() {
			return "[" + val + ", currMax=" + currentMax + "]";
		}
	}

}

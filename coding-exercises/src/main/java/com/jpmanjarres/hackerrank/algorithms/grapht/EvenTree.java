/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 20/03/2017
 *
 */
package com.jpmanjarres.hackerrank.algorithms.grapht;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 * 20/03/2017
 *
 */
public class EvenTree {


	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();


		List<Integer>[] list = new List[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			int u = in.nextInt()-1;
			int v = in.nextInt()-1;
			//list[u].add(v);
			list[v].add(u);
		}

		int count =0;
		Deque<Integer> stack = new ArrayDeque<>();
		stack.add(0);

		while(!stack.isEmpty()){
			int root = stack.poll();
			for(Integer i :  list[root]){
				if(countNodes(i, list) % 2 ==0){
					count++;
				}
				stack.add(i);
			}
		}

		System.out.println(count);
		in.close();
	}



	static int countNodes(int root, List<Integer>[] list){
		int count = 1;
		for(Integer i : list[root]){
			count += countNodes(i, list);
		}
		return count;
	}


}

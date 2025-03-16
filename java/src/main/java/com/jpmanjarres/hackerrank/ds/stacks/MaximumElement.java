/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 15/03/2017
 */
package com.jpmanjarres.hackerrank.ds.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     15/03/2017
 */
public class MaximumElement {

    static class CustomNode {
        int val;
        int currentMax;

        @Override
        public String toString() {
            return "[" + val + ", currMax=" + currentMax + "]";
        }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final Deque<CustomNode> stack = new ArrayDeque<>();

        int N = in.nextInt();
        for (int z = 0; z < N; z++) {

            int type = in.nextInt();

            if (type == 1) {
                int element = in.nextInt();

                final CustomNode node = new CustomNode();
                node.val = element;
                node.currentMax = element;

                if (!stack.isEmpty()) {
                    int top = stack.peek().currentMax;
                    node.currentMax = Math.max(element, top);
                }

                stack.push(node);

            } else if (type == 2) {
                stack.pop();
            } else if (type == 3) {
                System.out.println(stack.peek().currentMax);
            }
        }
        in.close();
    }
}

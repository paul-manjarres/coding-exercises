/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 15/03/2017
 */
package com.jpmanjarres.hackerearth.ds.linkedlists;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     15/03/2017
 */
public class RemoveFriends {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            int N = in.nextInt();
            int K = in.nextInt();

            // Create the list
            Node head = new Node(in.nextInt());
            Node curr = head;
            for (int j = 0; j < N - 1; j++) {
                curr.next = new Node(in.nextInt());
                curr.next.prev = curr;
                curr = curr.next;
            }

            curr = removeFriends(head, K);

            // Print
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
        in.close();
    }

    public static Node removeFriends(Node head, int K) {

        Node curr = head;

        while (K > 0) {

            if (curr.next == null) {
                curr = curr.prev == null ? head : curr.prev;
                K--;
            } else if (curr.data < curr.next.data) {

                if (curr.prev == null) {
                    head = curr.next;
                    head.prev = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                curr = curr.prev == null ? head : curr.prev;
                K--;

            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node() {}

        public Node(int data) {
            super();
            this.data = data;
        }

        @Override
        public String toString() {
            return "[" + data + "]";
        }
    }
}

/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 14/03/2017
 */
package com.jpmanjarres.hackerrank.ds.linkedlists;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     14/03/2017
 */
public class CompareTwoLinkedLists {

    static class Node {
        int data;
        Node next;

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

    public static void main(String[] args) {

        Node headA = new Node(1);
        headA.next = new Node(2);

        Node headB = new Node(1);
        headB.next = null;

        System.out.println(CompareLists(headA, headB));
    }

    public static int CompareLists(Node headA, Node headB) {

        if (headA == null && headB == null) {
            return 1;
        }
        if (headA == null) {
            return 0;
        }
        if (headB == null) {
            return 0;
        }

        Node curr = headA;
        Node curr2 = headB;

        while (curr != null) {

            if (curr2 == null) {
                return 0;
            }

            if (curr.data != curr2.data) {
                return 0;
            }
            curr = curr.next;
            curr2 = curr2.next;
        }

        if (curr2 != null) {
            return 0;
        }

        return 1;
    }
}

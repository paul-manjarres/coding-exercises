/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 25/04/2017
 */
package com.jpmanjarres.hackerearth.ds.linkedlists;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     25/04/2017
 */
public class InsertedIntoSortedList {

    static Node SortedInsert(Node head, int data) {

        Node n = new Node();
        n.data = data;

        if (head == null) {
            return n;
        }

        Node curr = head;
        Node last = null;
        boolean inserted = false;

        while (curr != null) {

            if (curr.data > data) {

                Node next = curr;
                Node prev = curr.prev;

                if (prev != null) {
                    prev.next = n;
                }
                n.prev = prev;
                n.next = next;
                if (next != null) {
                    next.prev = n;
                }
                inserted = true;
                break;
            }
            last = curr;
            curr = curr.next;
        }

        if (!inserted) {
            last.next = n;
            n.prev = last;
        }

        return head;
    }

    public static void main(String[] argsO) {

        Node n = new Node(1);
        n.next = new Node(4);
        n.next.prev = n;

        n.next.next = new Node(9);
        n.next.next.prev = n.next;

        Node head = SortedInsert(n, 5);
        printLinkedList(head);
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

    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(" NULL");
    }
}

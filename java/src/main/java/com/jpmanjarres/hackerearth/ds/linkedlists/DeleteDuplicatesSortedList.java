/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 26/04/2017
 */
package com.jpmanjarres.hackerearth.ds.linkedlists;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     26/04/2017
 */
public class DeleteDuplicatesSortedList {

    static Node RemoveDuplicates(Node head) {

        if (head == null) {
            return head;
        }
        Node curr = head;
        boolean removed = false;
        while (curr != null) {
            removed = false;

            if (curr.next != null && curr.data == curr.next.data) {
                Node next = curr.next.next;
                curr.next = next;
                removed = true;
            }

            if (!removed) {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] argsO) {

        Node n = new Node(1);
        Node head = n;

        n.addNode(new Node(1));
        n = n.next;

        n.addNode(new Node(9));
        n = n.next;

        n.addNode(new Node(9));
        n = n.next;

        n.addNode(new Node(9));

        head = RemoveDuplicates(head);
        printLinkedList(head);
    }

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

        public Node addNode(Node n) {
            if (n == null) {
                return this;
            }

            this.next = n;

            return this;
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

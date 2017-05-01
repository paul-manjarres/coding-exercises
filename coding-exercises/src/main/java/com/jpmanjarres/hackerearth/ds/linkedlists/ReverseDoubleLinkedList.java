/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 25/04/2017
 *
 */
package com.jpmanjarres.hackerearth.ds.linkedlists;


/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 * 25/04/2017
 *
 */
public class ReverseDoubleLinkedList {


	static Node Reverse(Node head) {

		if(head == null){
			return null;
		}
		Node curr = head;
		Node last = null;

		while(curr != null){
			Node next = curr.next;
			Node prev = curr.prev;

			curr.next = prev;
			curr.prev = next;

			last = curr;
			curr = next;
		}
		return last;
	}


	public static void main(String[] argsO) {

		Node n = new Node(1);
		n.next = new Node(2);
		n.next.prev = n;

		n.next.next = new Node(3);
		n.next.next.prev = n.next;


		Node head = Reverse(n);
		printLinkedList(head);


	}



	static class Node {
		int data;
		Node next;
		Node prev;

		public Node() {
		}

		public Node(int data) {
			super();
			this.data = data;
		}

		@Override
		public String toString() {
			return "[" + data + "]";
		}
	}

	public static void printLinkedList(Node head){
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data+" -> ");
			curr = curr.next;
		}
		System.out.println(" NULL");
	}
}

/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 14/03/2017
 *
 */
package com.jpmanjarres.hackerrank.ds.linkedlists;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br/>
 *         14/03/2017
 *
 */
public class MergeTwoSortedLL {

	static class Node {
		int data;
		Node next;

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

	public static void main(String[] args) {

//		Node headA = new Node(1);
//		headA.next = new Node(2);
//		headA.next.next = new Node(3);
//		headA.next.next.next = new Node(7);
//		headA.next.next.next.next = new Node(8);
//		headA.next.next.next.next.next = new Node(9);
//
//		Node headB = new Node(3);
//		headB.next = new Node(5);
//		headB.next.next = new Node(6);


		Node headA = new Node(12);

		Node headB = new Node(15);


		Node n = MergeLists(headA, headB);

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static Node MergeLists(Node headA, Node headB) {

		if (headA == null && headB == null)
			return null;
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;

		Node newHead, sec, temp, temp2;

		if (headA.data <= headB.data) {
			newHead = headA;
			sec = headB;
		} else {
			newHead = headB;
			sec = headA;
		}

		Node curr = newHead;

		if(curr.next == null){
			curr.next = sec;
			return newHead;
		}


		while (curr != null) {




			if (curr.next.data <= sec.data) {
				curr = curr.next;
			} else {
				temp = curr.next;
				temp2 = sec.next;

				curr.next = sec;
				sec.next = temp;
				sec = temp2;

				curr = curr.next;
			}

			if (curr.next == null) {
				curr.next = sec;
				curr = null;
			}

			if (sec == null) {
				curr = null;
			}
		}

		return newHead;
	}

}

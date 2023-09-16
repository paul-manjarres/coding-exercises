/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 15/03/2017
 */
package com.jpmanjarres.hackerrank.ds.linkedlists;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     15/03/2017
 */
public class FindMergePoint {

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
    Node headB = new Node(1);

    Node merge = new Node(2);
    merge.next = new Node(3);

    headA.next = merge;

    headB.next = merge;

    System.out.println(FindMergeNode(headA, headB));
  }

  public static int FindMergeNode(Node headA, Node headB) {

    if (headA.next == headB.next) {
      return headA.next.data;
    }

    Node curr = headA;
    int sizeA = 0;
    while (curr != null) {
      curr = curr.next;
      sizeA++;
    }

    curr = headB;
    int sizeB = 0;
    while (curr != null) {
      curr = curr.next;
      sizeB++;
    }

    Node currA, currB;

    if (sizeA == sizeB) {
      currA = headA;
      currB = headB;
    } else if (sizeA > sizeB) {

      int diff = sizeA - sizeB;
      currA = headA;
      for (int i = 0; i < diff; i++) {
        currA = currA.next;
      }
      currB = headB;
    } else {

      int diff = sizeB - sizeA;
      currB = headB;
      for (int i = 0; i < diff; i++) {
        currB = currB.next;
      }
      currA = headA;
    }

    while (currA != null && currB != null) {
      if (currA == currB) {
        return currA.data;
      }
      currA = currA.next;
      currB = currB.next;
    }

    return 0;
  }
}

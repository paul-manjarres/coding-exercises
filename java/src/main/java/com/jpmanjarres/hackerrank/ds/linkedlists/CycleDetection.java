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
public class CycleDetection {

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

    Node head = new Node(1);
    Node node2 = new Node(2);
    head.next = node2;
    head.next.next = new Node(3);
    head.next.next.next = null;

    System.out.println(hasCycle(head));
  }

  public static boolean hasCycle(Node head) {

    if (head == null || head.next == null) {
      return false;
    }

    Node runA = head;
    Node runB = head.next;

    while (runA != null && runB != null) {
      if (runA == runB) {
        return true;
      }
      runA = runA.next;

      if (runB.next == null) {
        return false;
      }
      runB = runB.next.next;
    }
    return false;
  }
}

package com.jpmanjarres.leetcode.from1to20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class MergeTwoSortedLists21Test {

    MergeTwoSortedLists21 solution = new MergeTwoSortedLists21();

    @Test
    void test() {
        // Given
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // When
        ListNode merged = solution.mergeTwoLists(l1, l2);

        // Then
        ListNode pointer = merged;
        then(pointer.val).isEqualTo(1);
        pointer = pointer.next;
        then(pointer.val).isEqualTo(1);
        pointer = pointer.next;
        then(pointer.val).isEqualTo(2);
        pointer = pointer.next;
        then(pointer.val).isEqualTo(3);
        pointer = pointer.next;
        then(pointer.val).isEqualTo(4);
        pointer = pointer.next;
        then(pointer.val).isEqualTo(4);
    }

    @Test
    void test2() {
        // Given
        ListNode l1 = null;
        ListNode l2 = null;

        // When
        ListNode merged = solution.mergeTwoLists(l1, l2);

        // Then
        then(merged).isNull();
    }

    @Test
    void test3() {
        // Given
        ListNode l1 = null;
        ListNode l2 = new ListNode(0,null);

        // When
        ListNode merged = solution.mergeTwoLists(l1, l2);

        // Then
        ListNode pointer = merged;
        then(pointer.val).isEqualTo(0);
        then(pointer.next).isNull();

    }

    @Test
    void test4() {
        // Given
        ListNode l1 = new ListNode(2, null);
        ListNode l2 = new ListNode(1, null);

        // When
        ListNode merged = solution.mergeTwoLists(l1, l2);

        // Then
        ListNode pointer = merged;
        then(pointer.val).isEqualTo(1);
        pointer = pointer.next;
        then(pointer.val).isEqualTo(2);
        pointer = pointer.next;
        then(pointer).isNull();

    }

}
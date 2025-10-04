package com.jpmanjarres.leetcode.from1to20;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2 == null){
            return null;
        }
        if(list1 == null){
            ListNode n = new ListNode(list2.val);
            list2 = list2.next;
            n.next = mergeTwoLists(null, list2);
            return  n;
        }
        if(list2 == null){
            ListNode n = new ListNode(list1.val);
            list1 = list1.next;
            n.next = mergeTwoLists(list1, null);
            return  n;
        }
        if(list1.val <= list2.val){
            ListNode n = new ListNode(list1.val);
            list1 = list1.next;
            n.next = mergeTwoLists(list1, list2);
            return n;
        }else{
            ListNode n = new ListNode(list2.val);
            list2 = list2.next;
            n.next = mergeTwoLists(list1, list2);
            return n;
        }
    }


}

 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("("+this.val+")=>");
        ListNode temp = this.next;
        int limit = 0;
        while(temp != null && limit<10){
            sb.append("("+temp.val+")=>");
            temp = temp.next;
            limit++;
        }
        sb.append("null");
        return sb.toString();
    }
}





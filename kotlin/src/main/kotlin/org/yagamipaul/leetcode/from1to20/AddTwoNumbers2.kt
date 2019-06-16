package org.yagamipaul.leetcode.from1to20

class AddTwoNumbers2 {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var currA = l1
        var currB = l2

        var result = null as ListNode?
        var head = null as ListNode?
        var carry = 0

        while(currA != null || currB != null){
            var a = currA?.`val` ?: 0
            var b = currB?.`val` ?: 0
            var c = 0

            if(carry > 0){
                c += carry
                carry = 0
            }

            c += a+b

            if(c >= 10){
                carry = 1
                c -= 10
            }

            if(result == null){
                result = ListNode(c)
                head = result
            }else{
                result.next = ListNode(c)
                result = result.next
            }

            currA = currA?.next
            currB = currB?.next

        }

        if(carry > 0){
            result!!.next = ListNode(carry)
        }

        return head

    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    companion object {
        fun createNumberList(arr: IntArray): AddTwoNumbers2.ListNode {
            var ret = AddTwoNumbers2.ListNode(arr[0])
            val head = ret
            for (i in 1 until arr.size) {
                ret.next = AddTwoNumbers2.ListNode(arr[i])
                ret = ret.next!!
            }
            return head
        }
    }

}

package org.yagamipaul.leetcode.from1to20

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AddTwoNumbers2Test {

    @Test
    fun `Example test case`() {
        val obj = AddTwoNumbers2()
        val arr1 = AddTwoNumbers2.createNumberList(intArrayOf(2, 4, 3))
        val arr2 = AddTwoNumbers2.createNumberList(intArrayOf(5, 6, 4))
        val sol = obj.addTwoNumbers(arr1, arr2)

        Assertions
            .assertThat(compareLists(AddTwoNumbers2.createNumberList(intArrayOf(7, 0, 8)), sol))
            .isTrue()
    }

    @Test
    fun `case 2`() {
        val obj = AddTwoNumbers2()
        val arr1 = AddTwoNumbers2.createNumberList(intArrayOf(8, 9, 4))
        val arr2 = AddTwoNumbers2.createNumberList(intArrayOf(4, 7, 6))
        val sol = AddTwoNumbers2.createNumberList(intArrayOf(2, 7, 1, 1))

        Assertions
            .assertThat(compareLists(obj.addTwoNumbers(arr1, arr2), sol))
            .isTrue()
    }

    @Test
    fun `case 3`() {
        val obj = AddTwoNumbers2()
        val arr1 = AddTwoNumbers2.createNumberList(intArrayOf(1, 8))
        val arr2 = AddTwoNumbers2.createNumberList(intArrayOf(0))
        val sol = obj.addTwoNumbers(arr1, arr2)

        Assertions
            .assertThat(compareLists(AddTwoNumbers2.createNumberList(intArrayOf(1, 8)), sol))
            .isTrue()
    }

    @Test
    fun `case 4`() {
        val obj = AddTwoNumbers2()
        val arr1 = AddTwoNumbers2.createNumberList(intArrayOf(0, 0, 1, 8))
        val arr2 = AddTwoNumbers2.createNumberList(intArrayOf(0))
        val sol = obj.addTwoNumbers(arr1, arr2)

        Assertions
            .assertThat(compareLists(AddTwoNumbers2.createNumberList(intArrayOf(0, 0, 1, 8)), sol))
            .isTrue()
    }

    @Test
    fun `case 5`() {
        val obj = AddTwoNumbers2()
        val arr1 = AddTwoNumbers2.createNumberList(intArrayOf(5))
        val arr2 = AddTwoNumbers2.createNumberList(intArrayOf(5))
        val sol = obj.addTwoNumbers(arr1, arr2)

        Assertions
            .assertThat(compareLists(AddTwoNumbers2.createNumberList(intArrayOf(0, 1)), sol))
            .isTrue()
    }

    private fun compareLists(a: AddTwoNumbers2.ListNode?, b: AddTwoNumbers2.ListNode?): Boolean {
        var currA = a
        var currB = b

        while (currA != null || currB != null) {
            if (currA?.`val` != currB?.`val`) {
                return false
            }
            currA = currA?.next
            currB = currB?.next
        }
        return true
    }
}

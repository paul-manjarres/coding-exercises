package org.yagamipaul.leetcode.from1to20

import java.util.*
import kotlin.math.max

class TwoSum1{

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = hashMapOf<Int,Int>()

        for ( i in 0 until nums.size){
            var index2 = map[target-nums[i]]
            if (index2 != null){
                return intArrayOf(minOf(i, index2), maxOf(i, index2) )
            }else{
                map[nums[i]] = i
            }
        }

        return IntArray(0)
    }

}

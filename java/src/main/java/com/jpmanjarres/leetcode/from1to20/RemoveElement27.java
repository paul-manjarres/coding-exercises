package com.jpmanjarres.leetcode.from1to20;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement27 {

    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>(nums.length);
        int k = 0;
        for (int i : nums) {
            if (i != val) {
                list.add(i);
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = list.get(i);
        }

        return k;
    }
}

package com.jpmanjarres.leetcode.from1to20;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            min = Math.min(min, s.length());
        }
        if (min == 0) {
            return "";
        }

        char curr;
        boolean add = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            curr = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != curr) {
                    add = false;
                    break;
                }
            }
            if (!add) {
                break;
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}

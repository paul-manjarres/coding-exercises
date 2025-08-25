package com.jpmanjarres.leetcode.from1to20;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestSubsNoRepeat3 {


    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        List<Character> list = new LinkedList<>();
        int maxSize = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            Character c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                list.add(c);
            }else{
                while(set.contains(c)) {
                    Character removed = list.removeFirst();
                    set.remove(removed);
                }
                list.add(c);
                set.add(c);
            }
            maxSize = Math.max(maxSize, list.size());
        }
        return maxSize;
    }

//    public int lengthOfLongestSubstring(String s) {
//        Set<Character> bag = new HashSet<>();
//        int maxSize = 0;
//        int globalMax = 0;
//        int length = s.length();
//        for (int i=0; i<length;i++){
//            if (globalMax> length- i){
//                break;
//            }
//            for(int j=i; j< length; j++) {
//                Character c = s.charAt(j);
//                if (!bag.contains(c)) {
//                    bag.add(c);
//                    maxSize++;
//                } else {
//                    bag.clear();
//                    globalMax = Math.max(globalMax, maxSize);
//                    maxSize = 0;
//                    break;
//                }
//            }
//        }
//        return Math.max(globalMax, maxSize);
//    }
}
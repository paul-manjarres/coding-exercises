package com.jpmanjarres.leetcode.from1to20;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses20 {


    public boolean isValid(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c== '['){
                queue.push(c);
            }
            if (c == ')' || c == '}' || c== ']'){
                if(queue.isEmpty()){
                    return false;
                }
                char c2 = queue.pop();
                if( (c == ')' && c2 != '(') ||
                    (c == '}' && c2 != '{') ||
                    (c == ']' && c2 != '[')
                ){
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }
}

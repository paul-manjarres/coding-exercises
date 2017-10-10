package com.jpmanjarres.hackerrank.ds.arrays;

import java.util.*;

public class BigSorting {


    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        final Map<Integer, List<String>> map = new HashMap<>();

        for (int _i = 0; _i < n; _i++) {

            final String s = in.next();
            List<String> list = map.get(s.length());
            if(list == null){
                list = new ArrayList<>();
                map.put(s.length(), list);
            }
            list.add(s);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(Integer i : keys){
            List<String> strs = map.get(i);
            Collections.sort(strs);

            for(String s : strs){
                System.out.println(s);
            }
        }

        in.close();
    }
}

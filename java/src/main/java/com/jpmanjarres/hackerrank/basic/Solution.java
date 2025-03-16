package com.jpmanjarres.hackerrank.basic;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(totalSum(arr));
        sc.close();
    }

    static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    static int totalSum(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0] < 0 ? 1 : 0;
        int total = 0;
        for (int i = 0; i < arr.length + 1; i++) {
            total += sum(Arrays.copyOfRange(arr, 0, i)) < 0 ? 1 : 0;
        }
        return total + totalSum(Arrays.copyOfRange(arr, 1, arr.length));
    }
}

package com.jpmanjarres.hackerrank.algorithms.search;


import java.util.*;

/**
 * Hackerland Radio Transmitters
 * https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
public class HackerlandRadioTransmitters {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int k = in.nextInt();
        final int[] x = new int[n];
        final int k2 = k*2;


        final Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            set.add(x[i]);
        }

        Arrays.sort(x);
        int i = 0;
        int count = 0;
        boolean covered = false;



        while(i < n){

            int c = x[i];
            if(i+1 == n){
                count++;
                break;
            }

            int c2 = x[i+1];

            if(c2-c > k){
                count++;
                i=i+1;
            }else if (c2-c == k){
                count++;
                while(c2 < c+k2) {
                    i++;
                    if(i+1 == n){
                        count++;
                        break;
                    }
                    c2 = x[i];
                }
                i++;
            }else{

                while(c2 < c+k && i<n-2){
                    i++;
                    c2 = x[i+1];
                }
                count++;
                c= x[i];

                while(c2 < c+k && i<n-2) {
                    i++;
                    c2 = x[i];
                }

            }


        }

        System.out.println(count);


    }
}

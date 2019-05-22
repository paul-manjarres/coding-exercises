package org.yagamipaul.hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FullCountingSortjava {


    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = in.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);

        StringBuilder[] arrFreq = new StringBuilder[100];
        int half = n / 2;

        for (int i = 0; i < 100; i++) {
            arrFreq[i] = new StringBuilder("");
        }

        for (int i = 0; i < n; i++) {
            tmp = in.readLine().split(" ");
            int number = Integer.parseInt(tmp[0]);
            String str = tmp[1];

            if(i >= half){
                arrFreq[number].append(str).append(" ");
            }else{
                arrFreq[number].append("- ");
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(arrFreq[i].toString());
        }
        System.out.println(sb.toString().trim());


    }
}

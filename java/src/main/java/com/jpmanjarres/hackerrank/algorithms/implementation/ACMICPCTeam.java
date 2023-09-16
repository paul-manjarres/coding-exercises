package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class ACMICPCTeam {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();

    BigInteger[] persons = new BigInteger[n];

    for (int i = 0; i < n; i++) {
      String s = in.next();
      persons[i] = new BigInteger(s, 2);
    }

    int maxTopics = 0;
    int teams = 0;

    for (int i = 0; i < persons.length; i++) {
      for (int j = i + 1; j < persons.length; j++) {

        BigInteger val = persons[i].or(persons[j]);
        int topics = val.bitCount();

        if (topics > maxTopics) {
          maxTopics = topics;
          teams = 1;
        } else if (topics == maxTopics) {
          teams++;
        }
      }
    }

    System.out.println(maxTopics);
    System.out.println(teams);

    in.close();
  }
}

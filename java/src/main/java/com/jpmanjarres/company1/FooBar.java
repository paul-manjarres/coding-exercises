package com.jpmanjarres.company1;

import java.util.ArrayList;
import java.util.List;

public class FooBar {


  public static void main(String[] args) {

    System.out.println(solution(0));   // 23571
    System.out.println(solution(3));   // 71113
    System.out.println(solution(10000)); // 02192
  }

  public static String solution(int i) {
    // Your code here
    final int ID_SIZE = 5;
    String primes = getLambdaString(i + ID_SIZE);
    return primes.substring(i, i + ID_SIZE );
  }

  public static boolean isPrime(int n, List<Integer> primes) {
    for (Integer i : primes) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static String getLambdaString(int maxIndex) {
    final int FIRST_PRIME = 2;
    final List<Integer> primes = new ArrayList<>();
    final StringBuilder sb = new StringBuilder(""+FIRST_PRIME);
    int lastPrime = FIRST_PRIME;
    primes.add(FIRST_PRIME);

    for (int i = lastPrime; sb.length() <= maxIndex; i++) {
      if (isPrime(i, primes)) {
        primes.add(i);
        sb.append(i);
        lastPrime = i;
      }
    }
    return sb.toString();
  }
}

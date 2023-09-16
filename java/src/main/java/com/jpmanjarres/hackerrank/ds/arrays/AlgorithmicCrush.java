/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2017 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Proprietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 12/03/2017
 */
package com.jpmanjarres.hackerrank.ds.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     12/03/2017
 */
public class AlgorithmicCrush {

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();
    long max = Long.MIN_VALUE;

    List<Range> ranges = new ArrayList<>();
    Deque<ProblemInput> inputs = new ArrayDeque<>();

    for (int i = 0; i < M; i++) {
      ProblemInput input = new ProblemInput(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
      inputs.add(input);
    }

    ranges.add(new Range(0, N - 1, 0));

    // Process all inputs
    while (!inputs.isEmpty()) {

      ProblemInput curr = inputs.pop();
      List<Range> newRanges = new ArrayList<>();

      for (Range r : ranges) {

        if (curr.a > r.start && curr.b < r.end) {

          newRanges.add(new Range(r.start, curr.a - 1, r.val));
          newRanges.add(new Range(curr.a, curr.b, r.val + curr.k));
          newRanges.add(new Range(curr.b + 1, r.end, r.val));

          max = Math.max(max, r.val + curr.k);

        } else if (curr.a == r.start && curr.b < r.end) {

          newRanges.add(new Range(r.start, curr.b, r.val + curr.k));
          newRanges.add(new Range(curr.b + 1, r.end, r.val));
          max = Math.max(max, r.val + curr.k);

        } else if (curr.a > r.start && curr.b == r.end) {

          newRanges.add(new Range(r.start, curr.a - 1, r.val));
          newRanges.add(new Range(curr.a, r.end, r.val + curr.k));
          max = Math.max(max, r.val + curr.k);

        } else if (curr.a == r.start && curr.b == r.end) {

          newRanges.add(new Range(curr.a, curr.b, r.val + curr.k));
          max = Math.max(max, r.val + curr.k);

        } else if (curr.a < r.start && curr.b < r.start) {
          newRanges.add(r);

        } else if (curr.a > r.end) {
          newRanges.add(r);

        } else if (curr.a > r.start && curr.b > r.end) {

          newRanges.add(new Range(r.start, curr.a - 1, r.val));
          newRanges.add(new Range(curr.a, r.end, r.val + curr.k));

          ProblemInput newInput = new ProblemInput(r.end + 1, curr.b, curr.k);
          inputs.push(newInput);

          curr.b = r.end;

          max = Math.max(max, r.val + curr.k);

        } else if (curr.a == r.start && curr.b > r.end) {

          newRanges.add(new Range(curr.a, r.end, r.val + curr.k));
          ProblemInput newInput = new ProblemInput(r.end + 1, curr.b, curr.k);
          inputs.push(newInput);

          curr.b = r.end;

          max = Math.max(max, r.val + curr.k);

        } else if (curr.a < r.start && curr.b > r.start && curr.b < r.end) {

          ProblemInput newInput = new ProblemInput(curr.a, r.start - 1, curr.k);
          inputs.push(newInput);

          newRanges.add(new Range(r.start, curr.b, r.val + curr.k));
          newRanges.add(new Range(curr.b + 1, r.end, r.val));

          curr.a = r.start;

          max = Math.max(max, r.val + curr.k);

        } else if (curr.a < r.start && curr.b > r.end) {

          ProblemInput newInput1 = new ProblemInput(curr.a, r.start - 1, curr.k);
          ProblemInput newInput2 = new ProblemInput(r.end + 1, curr.b, curr.k);
          inputs.push(newInput1);
          inputs.push(newInput2);

          newRanges.add(new Range(r.start, r.end, r.val + curr.k));

          curr.a = r.start;
          curr.b = r.end;

          max = Math.max(max, r.val + curr.k);
        }
      }

      ranges.clear();
      ranges = newRanges;
    }

    System.out.println(max);
    in.close();
  }
}

class ProblemInput {
  public int a;
  public int b;
  public long k;

  public ProblemInput(int a, int b, long k) {
    this.a = a;
    this.b = b;
    this.k = k;
  }

  @Override
  public String toString() {
    return "[a=" + a + ", b=" + b + ", k=" + k + "]";
  }
}

class Range {
  int start;
  int end;
  long val;

  public Range(int start, int end, long val) {
    super();
    this.start = start;
    this.end = end;
    this.val = val;
  }

  @Override
  public String toString() {
    return "Range [" + start + "," + end + "] =" + val;
  }
}

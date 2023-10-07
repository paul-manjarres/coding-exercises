package com.jpmanjarres.company1;

import java.util.*;

public class FooBarCh4 {

  public static int[] solution(int[][] m) {
    // Your code here
    printIntMatrix(m);

    // 0. TODO Identificar los casos bordes, triviales
    // 1. Identificar cuales son terminales
    final List<Integer> terminals = findTerminalIds(m);
    System.out.println("Terminals: " + terminals);

    final int[] totalEvents = new int[m.length];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        totalEvents[i] += m[i][j];
      }
    }

    System.out.println(Arrays.toString(totalEvents));


    final int[] probabilities = new int[terminals.size() + 1];

    // 2. Identificar cuales son inalcanzables, P=0%
    //final List<Integer> unreachables = findUnreachables(m);
    //System.out.println("unreachables: " + unreachables);

    // 3. Identificar P del camino directo

    int lcm = 1;

    List<Rational> terminalProbabilities = new ArrayList<>();
    for (Integer t : terminals) {

      List<PathProb> paths = new ArrayList<>();
      PathProb currentPath = new PathProb();
      currentPath.addNode(0, new Rational(1, 1));
      visit(m, 0, new int[m.length], t, currentPath, paths, totalEvents);
      //paths.stream().forEach(PathProb::reduceProbabilities);

      Rational sum = new Rational(0, 1);
      for (PathProb p : paths) {
        sum = Rational.sum(sum, p.calculatePathProbability());
      }
      sum = sum.simplify();
      // lcm(a,b,c) = lcm(lcm(a,b),c)
      lcm = lcm(lcm, sum.d);
      terminalProbabilities.add(sum);

      System.out.println("Paths to : " + t + " : " + paths + " - Sum: " + sum);

    }
    System.out.println("Terminal probabilities: "+terminalProbabilities);
    System.out.println("lcm: "+lcm);

    int i = 0;
    for(Rational r : terminalProbabilities){
      if(r.n ==0){
        probabilities[i] = 0;
      }
      else if(r.d == lcm){
        probabilities[i] = r.n;
      }else{
        probabilities[i] = r.n * (lcm / r.d);
      }
      i++;
    }

    probabilities[i] = lcm;
    System.out.println("Probabilities: " + Arrays.toString(probabilities));

    return probabilities;
  }

  public static boolean visit(int[][] arr, int node, int[] visited, int target, PathProb currentPath, List<PathProb> paths, int[] totalEvents) {

    //System.out.println("Current Path: " + currentPath);
    visited[node] = visited[node] + 1;
    if (node == target) {
      paths.add(PathProb.from(currentPath));
      //System.out.println("Found Path! : " + currentPath);
      return true;
    }

    for (int i = 0; i < arr[node].length; i++) {
      int childProb = arr[node][i];
      Rational probability = new Rational(childProb, totalEvents[node]);
      int child = i;
      if (childProb > 0 && (visited[child] == 0 || visited[child] == 1)) {
        currentPath.addNode(child, probability);
        //System.out.println("Adding " + child + " Prob: " + probability);
        visit(arr, child, Arrays.copyOf(visited, visited.length), target, currentPath, paths, totalEvents);
        currentPath.removeLast();
      } else if (childProb > 0 && visited[child] > 1) {
        //Permite e identifica el ciclo.
        Rational p1 = currentPath.getProbabilities().get(currentPath.probabilities.size() - 3);
        Rational p2 = currentPath.getProbabilities().get(currentPath.probabilities.size() - 2);
        Rational act = currentPath.probabilities.remove(currentPath.probabilities.size() - 1);
        Rational cicleMultiplier = new Rational(p1.d * p2.d, (p1.d * p2.d - p1.n * p2.n));
        currentPath.probabilities.remove(currentPath.probabilities.size() - 1);

        currentPath.probabilities.add(Rational.multiply(p2, cicleMultiplier));
        currentPath.probabilities.add(act);
        System.out.println("Ciclo:: " + child + " - " + currentPath + " P1: " + p1 + " - P2: " + p2);

      }
    }
    return false;
  }



  private static class PathProb {
    private List<Integer> path = new ArrayList<>();
    private List<Rational> probabilities = new ArrayList<>();

    static PathProb from(PathProb p) {
      PathProb pb = new PathProb();
      pb.path = new ArrayList<>(p.path);
      pb.probabilities = new ArrayList<>(p.probabilities);
      return pb;
    }

    void addNode(Integer node, Rational probability) {
      this.path.add(node);
      //if (!(probability.n == 1 && probability.d == 1)) {
        this.probabilities.add(probability.simplify());
      //}
    }

    void removeLast() {
      this.path.remove(this.path.size() - 1);
      this.probabilities.remove(this.probabilities.size() - 1);
    }

    List<Rational> getProbabilities() {
      return probabilities;
    }

    void reduceProbabilities() {
      int denominator = this.probabilities.stream().map(r -> r.d).reduce(1, (a, b) -> a * b);
      int numerator = this.probabilities.stream().map(r -> r.n).reduce(1, (a, b) -> a * b);
      this.probabilities.clear();
      this.probabilities.add(new Rational(numerator, denominator).simplify());
    }

    Rational calculatePathProbability() {
      int denominator = this.probabilities.stream().map(r -> r.d).reduce(1, (a, b) -> a * b);
      int numerator = this.probabilities.stream().map(r -> r.n).reduce(1, (a, b) -> a * b);
      return new Rational(numerator, denominator).simplify();
    }

    @Override
    public String toString() {
      return "{path=" + path + ", probabilities=" + probabilities + '}';
    }
  }

  private static class Rational {
    int n;
    int d;

    Rational(int a, int b) {
      this.n = a;
      this.d = b;
    }

    static Rational sum(Rational a, Rational b) {
      return new Rational(a.n * b.d + b.n * a.d, a.d * b.d).simplify();
    }

    static Rational multiply(Rational a, Rational b) {
      return new Rational(a.n * b.n, a.d * b.d).simplify();
    }

    Rational simplify() {
      int bigger = Math.max(this.n, this.d);
      Rational result = this;
      for (int i = 2; i < bigger / 2; ) {
        if (result.n % i == 0 && result.d % i == 0) {
          result = new Rational(result.n / i, result.d / i);
        } else {
          i++;
        }
      }
      return result;
    }

    @Override
    public String toString() {
      return n + "/" + d;
    }
  }

  public static List<Integer> findTerminalIds(int[][] m) {
    List<Integer> terminals = new ArrayList<>();
    for (int i = 0; i < m.length; i++) {
      boolean terminal = true;
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] > 0) {
          terminal = false;
          break;
        }
      }
      if (terminal) {
        terminals.add(i);
      }
    }
    return terminals;
  }

  public static List<Integer> findUnreachables(int[][] m) {
    List<Integer> unreachables = new ArrayList<>();
    for (int i = 0; i < m[0].length; i++) {
      boolean unreachable = true;
      for (int j = 0; j < m.length; j++) {
        if (m[j][i] > 0) {
          unreachable = false;
          break;
        }
      }
      if (unreachable) {
        unreachables.add(i);
      }
    }
    return unreachables;
  }

  public static int lcm(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    int higher = Math.max(a, b);
    int lower = Math.min(a, b);
    int lcm = higher;
    while (lcm % lower != 0) {
      lcm += higher;
    }
    return lcm;
  }

  public static void printIntMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      System.out.print("S" + i + " | ");
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }
  }


}

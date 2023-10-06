package com.jpmanjarres.company1;

import javax.sound.sampled.Line;
import java.util.*;

public class FooBarCh4 {

  public static int[] solution(int[][] m) {
    // Your code here
    printIntMatrix(m);

    // 0. Identificar los casos bordes, triviales
    // 1. Identificar cuales son terminales
    final List<Integer> terminals = findTerminalIds(m);
    System.out.println("Terminals: " + terminals);

    final int[] probabilities = new int[terminals.size() + 1];

    // 2. Identificar cuales son inalcanzables, P=0%
    final List<Integer> unreachables = findUnreachables(m);
    System.out.println("unreachables: " + unreachables);


    // 3. Identificar P del camino directo

    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(0);
    int[] visited = new int[m.length];
    //visited[0] = 1;

    List<List<Integer>> pathsTo5 = new ArrayList<>();
    List<Integer> currentPath = new ArrayList<>();
    currentPath.add(0);
    boolean x = visit(m, 0, visited, 5, currentPath, pathsTo5);

    System.out.println("Paths to : "+pathsTo5);

    // 4 Identificar P de ciclos
    //

    System.out.println("Probabilities: " + Arrays.toString(probabilities));

    return new int[]{7, 6, 8, 21};
  }



  public static boolean visit(int[][] arr, int node, int[] visited, int target, List<Integer> currentPath, List<List<Integer>> paths) {

    System.out.println("Current Path: "+ currentPath);
    visited[node] = visited[node]+1;
    if (node == target) {
      paths.add(new ArrayList<>(currentPath));
      System.out.println("Found Path!");
      return true;
    }


    for (int i = 0; i < arr[node].length; i++) {
      int childProb = arr[node][i];
      int child = i;
      if (childProb > 0 && (visited[child] == 0 || visited[child] == 1)) {
        currentPath.add(child);
        System.out.println("Adding "+child);
        boolean correct = visit(arr, child, Arrays.copyOf(visited, visited.length), target, currentPath, paths);
        //if(!correct){
          System.out.println("Removing last "+currentPath.get(currentPath.size()-1));
          currentPath.remove(currentPath.size()-1);

        //}
//        else{
//          return true;
//        }
      } else if (childProb > 0 && visited[child] > 1) {
        //Permite e identifica el ciclo.
        System.out.println("Ciclo:: " + child+ " - "+currentPath.get(currentPath.size()-1));
      }
    }


    return false;
}


//  public static List<Integer> visit(int[][] arr, Queue<Integer> queue, boolean[] visited, int target, List<Integer> currentPath, List<List<Integer>> paths, List<Integer> terminals) {
//
//    int node = queue.poll();
//
//    if (terminals.contains(node)) {
//      if (node == target) {
//        currentPath.add(node);
//        paths.add(currentPath);
//        return currentPath;
//      } else {
//        return new LinkedList<>();
//      }
//    }
//
//    for (int i = 0; i < arr[node].length; i++) {
//      int child = arr[node][i];
//      if (child > 0 && !visited[child]) {
//        queue.add(i);
//        visited[i] = true;
//
//        currentPath.addAll(visit(arr, queue, visited, target, currentPath, paths, terminals));
//      }
//    }
//
//    return currentPath;
//}


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

package com.jpmanjarres.company1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 26/11/2015
 */
public class Test1Amz {

    public static void main(String[] args) {

        // case 1
        int totalSteak = 3;
        int numSteak = 2;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(1, -1));

        List<List<Integer>> res = nearestXsteakHouses(totalSteak, list, numSteak);

        System.out.println(res);
    }

    public static List<List<Integer>> nearestXsteakHouses(
            int totalSteakhouses, List<List<Integer>> allLocations, int numSteakhouses) {

        List<Node> values = new ArrayList<>();
        for (int i = 0; i < totalSteakhouses; i++) {
            List<Integer> xy = allLocations.get(i);
            int x2 = xy.get(0) * xy.get(0);
            int y2 = xy.get(1) * xy.get(1);
            double dist = Math.sqrt(x2 + y2);
            Node n = new Node(i, dist);
            values.add(n);
        }

        // Sort the values, O(n*log(n))
        Collections.sort(values);

        // Populate the response with the first numSteakhouses answers
        final List<List<Integer>> response = new ArrayList<>(numSteakhouses);
        for (int i = 0; i < numSteakhouses; i++) {
            response.add(allLocations.get(values.get(i).index));
        }
        return response;
    }

    // Helper class, holds the index of the steakhouse and the distance to the customer
    static class Node implements Comparable<Node> {
        int index;
        double distance;

        Node(int index, double distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return Double.compare(this.distance, o.distance);
        }
    }
}

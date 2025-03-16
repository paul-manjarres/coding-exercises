package com.jpmanjarres.company1;

import java.util.*;

public class FooBarCh4 {

    public static int[] solution(int[][] m) {
        // Your code here
        printIntMatrix(m);
        final int[] totalEvents = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                totalEvents[i] += m[i][j];
            }
        }
        int lcm = 1;
        final List<Rational> terminalProbabilities = new ArrayList<>();
        final List<Integer> terminals = findTerminalIds(m);

        for (Integer t : terminals) {
            List<PathProb> paths = new ArrayList<>(); // The list of paths that lead to a terminal node
            PathProb currentPath = new PathProb(0, Rational.ONE); // A path with a probability of happening
            visit(m, 0, new int[m.length], t, currentPath, paths, totalEvents);

            // The total probability to reach a terminal state is the sum of all paths probabilities
            final Rational sum = paths.stream()
                    .map(PathProb::calculatePathProbability)
                    .reduce(Rational.ZERO, Rational::sum)
                    .simplify();

            for (PathProb p : paths) {

                System.out.println("* " + p + " - " + findCycleProbability(p));
            }

            System.out.println("[" + t + "] Total Probability: " + sum);

            lcm = lcm(lcm, sum.d); // lcm(a,b,c) = lcm(lcm(a,b),c)
            terminalProbabilities.add(sum);
        }

        int i = 0;
        final int[] probabilities = new int[terminals.size() + 1];

        for (Rational r : terminalProbabilities) {
            if (r.n == 0) {
                probabilities[i] = 0;
            } else if (r.d == lcm) {
                probabilities[i] = r.n;
            } else {
                probabilities[i] = r.n * (lcm / r.d);
            }
            i++;
        }
        probabilities[i] = lcm;
        System.out.println("Probabilities: " + Arrays.toString(probabilities));
        return probabilities;
    }

    static void visit(
            int[][] arr,
            int node,
            int[] visited,
            int target,
            PathProb currentPath,
            List<PathProb> paths,
            int[] totalEvents) {
        visited[node] = visited[node] + 1;
        if (node == target) {
            paths.add(PathProb.from(currentPath));
            System.out.println("Found path for " + target + " : P =[" + currentPath.calculatePathProbability() + "] :"
                    + currentPath + " - Cycle: " + currentPath.hasCycle
                    + " - Pcycle: " + currentPath.cycleProbability);
            return;
        }

        for (int i = 0; i < arr[node].length; i++) {
            int childProb = arr[node][i];
            int maxCycleRepetitions = 2;

            // if (childProb > 0 && (visited[i] == 0 ||  visited[i] == 1)) {
            if (childProb > 0 && (visited[i] <= maxCycleRepetitions)) {
                currentPath.addNode(i, new Rational(childProb, totalEvents[node]));
                // System.out.println("["+target+"] Adding node: Path: "+currentPath);
                visit(arr, i, Arrays.copyOf(visited, visited.length), target, currentPath, paths, totalEvents);
                currentPath.removeLast();
            } else if (childProb > 0 && visited[i] > maxCycleRepetitions) {
                // Modify probabilities when a cycle is detected
                // TODO: This dont work with cycle on the same node
                // Identificar si un camino tiene ciclo, y cual sería el camino directo y su probabilidad

                // findCycleProbability(currentPath);
                // System.out.println("["+target+"] Current path in cycle: "+currentPath+ " - Cycle prob:
                // "+currentPath.cycleProbability);

                //        Rational p1 = currentPath.getProbabilities().get(currentPath.getProbabilities().size() - 3);
                //        Rational p2 = currentPath.getProbabilities().get(currentPath.getProbabilities().size() - 2);
                //        Rational act = currentPath.getProbabilities().remove(currentPath.getProbabilities().size() -
                // 1);
                //
                //        // Sum of probabilities in a cycle is calculated as an infinite sum of convergent terms
                //        // We can multiply the probability of 2 paths in a cycle with: 1 / (1- p1*p2)
                //        Rational cycleMultiplier = new Rational(p1.d * p2.d, (p1.d * p2.d - p1.n * p2.n));
                //
                //        currentPath.getProbabilities().remove(currentPath.getProbabilities().size() - 1);
                //        currentPath.getProbabilities().add(Rational.multiply(p2, cycleMultiplier));
                //        currentPath.getProbabilities().add(act);
            }
        }
    }

    static class PathProb {
        private List<Integer> path = new ArrayList<>();
        private List<Rational> probabilities = new ArrayList<>();

        private boolean hasCycle = false;
        private Rational cycleProbability;
        private int[] cycleIndexes;

        void addCycleProbability(Rational r, int[] cycleIndexes) {
            this.hasCycle = true;
            this.cycleProbability = r;
            this.cycleIndexes = cycleIndexes;
        }

        static PathProb from(PathProb p) {
            PathProb pb = new PathProb();
            pb.path = new ArrayList<>(p.path);
            pb.probabilities = new ArrayList<>(p.probabilities);
            return pb;
        }

        PathProb(Integer node, Rational probability) {
            this.path.add(node);
            this.probabilities.add(probability);
        }

        PathProb() {}

        void addNode(Integer node, Rational probability) {
            this.path.add(node);
            this.probabilities.add(probability.simplify());
        }

        void removeLast() {
            this.path.remove(this.path.size() - 1);
            this.probabilities.remove(this.probabilities.size() - 1);
        }

        List<Rational> getProbabilities() {
            return probabilities;
        }

        public List<Integer> getPath() {
            return path;
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

    static class Rational {
        private final int n;
        private final int d;

        Rational(int a, int b) {
            this.n = a;
            this.d = b;
        }

        static final Rational ONE = new Rational(1, 1);
        static final Rational ZERO = new Rational(0, 1);

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rational rational = (Rational) o;
            return n == rational.n && d == rational.d;
        }

        @Override
        public int hashCode() {
            return Objects.hash(n, d);
        }
    }

    static Rational findCycleProbability(PathProb path) {
        final Map<Integer, Rational> map = new HashMap<>();
        for (int i = 0; i < path.getPath().size(); i++) {
            if (map.containsKey(path.getPath().get(i))) {
                map.put(i, path.getProbabilities().get(i));
                break;
            } else {
                map.put(i, path.getProbabilities().get(i));
            }
        }
        Rational p =
                map.values().stream().reduce(Rational.ONE, Rational::multiply).simplify();

        Rational cp = new Rational(p.n, p.d - p.n).simplify();

        // path.addCycleProbability(cp, map.keySet().stream().mapToInt(Integer::intValue).toArray());
        return cp;
    }

    static Rational findDirectRouteProbability(PathProb path) {
        final Map<Integer, Rational> map = new HashMap<>();
        for (int i = 0; i < path.getPath().size(); i++) {
            if (map.containsKey(path.getPath().get(i))) {
                map.put(i, path.getProbabilities().get(i));
                break;
            } else {
                map.put(i, path.getProbabilities().get(i));
            }
        }
        Rational p =
                map.values().stream().reduce(Rational.ONE, Rational::multiply).simplify();
        return new Rational(p.n, p.d - p.n).simplify();
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

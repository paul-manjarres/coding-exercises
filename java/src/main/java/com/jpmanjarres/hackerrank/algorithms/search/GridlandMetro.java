package com.jpmanjarres.hackerrank.algorithms.search;

import java.util.*;

public class GridlandMetro {

    /**
     * @param args
     */
    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long k = in.nextLong();

        long sum = 0;

        final Map<Integer, List<Span>> map = new HashMap<>();

        for (long _i = 0; _i < k; _i++) {
            int r = in.nextInt();
            long c1 = in.nextInt();
            long c2 = in.nextInt();

            final List<Span> spans = map.containsKey(r) ? map.get(r) : new ArrayList<>();
            spans.add(new Span(c1, c2));
            map.put(r, mergeSpans(spans));
        }

        for (List<Span> list : map.values()) {
            for (Span s : list) {
                // System.out.print(s);
                sum += s.end - s.start + 1;
            }
            // System.out.println();
        }

        System.out.println((n * m) - sum);
        in.close();
    }

    /**
     * @param spans
     * @return
     */
    private static List<Span> mergeSpans(List<Span> spans) {
        if (spans == null || spans.isEmpty() || spans.size() == 1) {
            return spans;
        }

        Collections.sort(spans, new SpanComparator());
        final Deque<Span> result = new ArrayDeque<>();

        for (int i = 0; i < spans.size() - 1; i++) {
            final Span s1 = spans.get(i);
            final Span s2 = spans.get(i + 1);

            if (s1.end < s2.start) {
                result.add(s1);
                result.add(s2);

            } else {
                if (s1.start <= s2.start && s2.end <= s1.end) {
                    if (!result.isEmpty()) result.removeLast();
                    result.add(new Span(s1.start, s1.end));
                } else {
                    Span s3 = new Span(s1.start, s2.end);
                    if (s1.end >= s2.end) {
                        s3.end = s2.end;
                    }
                    if (!result.isEmpty()) result.removeLast();
                    result.add(s3);
                }
            }
        }

        return new ArrayList<>(result);
    }

    static class SpanComparator implements Comparator<Span> {
        @Override
        public int compare(Span o1, Span o2) {
            return Long.compare(o1.start, o2.start);
        }
    }

    static class Span {
        public long start;
        public long end;

        Span(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "(" + this.start + "," + this.end + ")";
        }
    }
}

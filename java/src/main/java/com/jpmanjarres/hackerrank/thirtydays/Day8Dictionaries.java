package com.jpmanjarres.hackerrank.thirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     8/03/2017
 */
public class Day8Dictionaries {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<String, Integer> book = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            book.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here

            Integer tel = book.get(s);

            if (tel != null) {
                System.out.println(s + "=" + book.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

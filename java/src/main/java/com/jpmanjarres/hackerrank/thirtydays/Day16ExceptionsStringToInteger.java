package com.jpmanjarres.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a><br>
 *     8/03/2017
 */
public class Day16ExceptionsStringToInteger {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }

        in.close();
    }
}

/** */
package com.jpmanjarres.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 9/12/2015
 */
public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        long p = in.nextInt();
        long q = in.nextInt();

        final List<Long> kaprekarNumbers = new ArrayList<>();

        for (long i = p; i <= q; i++) {

            // Special case
            if (i == 1) {
                kaprekarNumbers.add(i);
            }

            int d = String.valueOf(i).length();

            String number = String.valueOf(i * i);

            for (int j = 1; j < number.length(); j++) {

                long l = Integer.valueOf(number.substring(0, j));
                long r = Integer.valueOf(number.substring(j, number.length()));

                if (l + r == i
                        && l != 0
                        && r != 0
                        && number.substring(j, number.length()).length() == d) {
                    //					System.out.println("Number: " + i + " - N2: " + number + " L: " + l + " - R: " +
                    // r);
                    kaprekarNumbers.add(i);
                    break;
                }
            }
        }

        if (kaprekarNumbers.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            // Print kaprekar numbers
            for (int i = 0; i < kaprekarNumbers.size(); i++) {
                System.out.print(kaprekarNumbers.get(i) + " ");
            }
        }

        in.close();
    }
}

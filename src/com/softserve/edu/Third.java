package com.softserve.edu;

import java.util.Scanner;

/**
 * 559. Дано натуральное число n. Найти все меньшие n числа Марсена.
 */
class Third {

/**
 * @param arg number
 */
    public static void main(final String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        in.close();
        /*
         * Find all Marsens numbers less then n.
         */
        for (int i = 0; i <= n; i++) {
            double element = Math.pow(2.0, i + 1.0) - 1.0;
            if (element <= n) {
                System.out.println("Marsen number is:" + element);
            }
        }
    }
}
